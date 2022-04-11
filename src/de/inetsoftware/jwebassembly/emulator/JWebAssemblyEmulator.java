/*
 * Copyright 2020 - 2022 Volker Berlin (i-net software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.inetsoftware.jwebassembly.emulator;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

import javax.annotation.Nonnull;

import de.inetsoftware.jwebassembly.web.DOMString;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

/**
 * The main class start point for the emulator.
 * 
 * @author Volker Berlin
 */
@SuppressWarnings( "restriction" )
public class JWebAssemblyEmulator {

    static {
        // move the JavaScript console to System.out
        com.sun.javafx.webkit.WebConsoleListener.setDefaultListener( ( webView, message, lineNumber, sourceId ) -> {
            System.out.println( message + "[at " + lineNumber + "]" );
        } );
    }

    /**
     * Launch the emulator only with command line arguments
     * 
     * @param args
     *            the class and method that should be called
     */
    public static void main( String[] args ) {
        if( args.length >= 2 ) {
            try {
                String className = args[0];
                String methodName = args[1];
                launch( null, "", () -> {
                    Class<?> clazz = Class.forName( className );
                    Method method = clazz.getDeclaredMethod( methodName );
                    if( (method.getModifiers() & Modifier.STATIC) == 0 ) {
                        throw new Exception( "Method must be static" );
                    }
                    return method.invoke( null );
                } );
                return;
            } catch( Throwable th ) {
                th.printStackTrace();
            }
        }
        System.out.println( "Usage: java -javaagent:<path>/jwebassembly-api.jar de.inetsoftware.jwebassembly.emulator.JWebAssemblyEmulator <classname> <methodname>" );
    }

    /**
     * Start the emulator from a resource file, load the html page and call the given main method.
     * 
     * @param htmlPage
     *             The resource of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchResource( @Nonnull String htmlPage, @Nonnull Runnable main ) {
        launchResource( htmlPage, () -> {main.run();return null;} );
    }

    /**
     * Start the emulator from a resource file, load the html page and call the given main method.
     * 
     * @param htmlPage
     *             The resource of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchResource( @Nonnull String htmlPage, @Nonnull Callable<?> main ) {
        URL resource = ClassLoader.getSystemResource( htmlPage );
        Objects.requireNonNull( resource, "Resource not found for: " + htmlPage );
        launch( resource.toString(), null, main );
    }

    /**
     * Start the emulator from a URL, load the html page and call the given main method.
     * 
     * @param htmlPageURL
     *             The URL of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchURL( @Nonnull URL htmlPageURL, @Nonnull Runnable main ) {
        launchURL( htmlPageURL, () -> {main.run();return null;} );
    }

    /**
     * Start the emulator from a URL, load the html page and call the given main method.
     * 
     * @param htmlPageURL
     *             The URL of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchURL( @Nonnull URL htmlPageURL, @Nonnull Callable<?> main ) {
        Objects.requireNonNull( htmlPageURL, "URL of HTML page is null." );
        launch( htmlPageURL.toString(), null, main );
    }

    /**
     * Start the emulator from a URL, load the html page and call the given main method.
     * 
     * @param content
     *             The content of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchContent( @Nonnull String content, @Nonnull Runnable main ) {
        Objects.requireNonNull( content, "Content of HTML page is null." );
        launch( null, content, () -> {main.run();return null;} );
    }

    /**
     * Start the emulator from a URL, load the html page and call the given main method.
     * 
     * @param content
     *             The content of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    public static void launchContent( @Nonnull String content, @Nonnull Callable<?> main ) {
        Objects.requireNonNull( content, "Content of HTML page is null." );
        launch( null, content, main );
    }

    /**
     * Start the emulator.
     * 
     * @param htmlPageURL
     *            The URL of the html page that the WebAssembly contains.
     * @param content
     *            The content of the html page that the WebAssembly contains.
     * @param main
     *            the executable with the main function
     */
    private static void launch( String htmlPageURL, String content, @Nonnull Callable<?> main ) {
        JavaFxApplication.url = htmlPageURL;
        JavaFxApplication.content = content;
        JavaFxApplication.main = main;
        JavaFxApplication.error = null;

        if( JavaFxApplication.stage == null ) {
            //we start a new thread because JavaFX is blocking
            Thread thread = new Thread() {
                public void run() {
                    try {
                        JavaFxApplication.launch( JavaFxApplication.class, new String[0] );
                    } catch( Throwable th ) {
                        JavaFxApplication.error = th;
                    }
                }
            };
            thread.start();
        }
        while( JavaFxApplication.error == null && JavaFxApplication.stage == null ) {
            try {
                Thread.sleep( 1 );
            } catch( InterruptedException th ) {
                JavaFxApplication.error = th;
            }
        }
        if( JavaFxApplication.error == null ) {
            CountDownLatch launchLatch = new CountDownLatch( 1 );
            Platform.runLater( () -> {
                try {
                    JavaFxApplication.execute();
                } catch( Throwable th ) {
                    JavaFxApplication.error = th;
                }
                launchLatch.countDown();
            });
            try {
                launchLatch.await();
            } catch( InterruptedException th ) {
                JavaFxApplication.error = th;
            }
        }
        if( JavaFxApplication.error != null ) {
            throw throwAny( JavaFxApplication.error );
        }
    }

    /**
     * Hide the emulator window
     */
    static void hide() {
        Platform.setImplicitExit(false);
        JavaFxApplication.stage.hide();
    }

    /**
     * Throws any (checked) exception without in signature
     * 
     * @param e the exception
     * @param <E> any Throwable
     * @throws E any Throwable
     */
    static <E extends Throwable> E throwAny( Throwable e ) throws E {
        throw (E)e;
    }

    /**
     * The implementation of the javafx Application.
     * 
     * @author Volker Berlin
     */
    public static class JavaFxApplication extends Application {

        private static String    url;

        private static String    content;

        private static Callable<?>  main;

        private static Stage     stage;

        private static WebEngine webEngine;

        private static JSObject  wasmImports;

        private static Throwable error;

        private static final Set<ImportAnnotation> ANNOTATIONS = ConcurrentHashMap.newKeySet();

        /**
         * register a JavaScript function from a nation method with annotation in the wasmimports
         * 
         * @param anno
         *            the annotation
         */
        static void registerScript( @Nonnull ImportAnnotation anno ) {
            if( wasmImports == null ) {
                // A class with native code was loaded before launching, can occur with JUnit testing
                JWebAssemblyEmulator.launch( url, content, () -> {return null;} );
            }
            ANNOTATIONS.add( anno );
            if( !Platform.isFxApplicationThread() ) {
                // A class with native code was loaded outside of the event thread
                Platform.runLater( () -> registerScript( anno ) );
                return;
            }

            Object obj = wasmImports.getMember( anno.module );
            if( "undefined".equals( obj ) ) {
                webEngine.executeScript( "wasmImports." + anno.module + " = {}" );
            }

            webEngine.executeScript( "wasmImports." + anno.module + "." + anno.name + "=" + anno.javaScript );

            if( anno.callbacks != null ) {
                obj = wasmImports.getMember( "instance" );
                if( "undefined".equals( obj ) ) {
                    webEngine.executeScript( "wasmImports.instance = {}" );
                    webEngine.executeScript( "wasmImports.instance.exports = {}" );
                }
                JSObject exports = (JSObject)webEngine.executeScript( "wasmImports.instance.exports" );
                for( String callback : anno.callbacks ) {
                    int idx1 = callback.indexOf( '.' );
                    int idx2 = callback.indexOf( '(' );
                    String name = callback.substring( idx1 + 1, idx2 );
                    callbacks.put( name, callback );
                    StringBuilder builder = new StringBuilder();
                    builder.append( "wasmImports.instance.exports." ).append( name ).append( "=function(){" );
                    builder.append( "const a=arguments[0];" );
                    builder.append( "const b=arguments[1];" );
                    builder.append( "const c=arguments[2];" );
                    builder.append( "const d=arguments[3];" );
                    builder.append( "const e=arguments[4];" );
                    builder.append( "const f=arguments[5];" );
                    builder.append( "const g=arguments[6];" );
                    builder.append( "const h=arguments[7];" );
                    builder.append( "wasmImports.instance.exports.callbacks.callback('" ).append( name ).append( "',a,b,c,d,e,f,g,h);}" ); // must match the parameter count from CallbackHandler.callback(...)
                    webEngine.executeScript( builder.toString() );
                }
                exports.setMember( "callbacks", callbackHandler );
            }
       }

        /**
         * The bridge method for the WebAssembly import function into the JavaScript.
         * 
         * @param moduleName
         *            the name of the module
         * @param methodName
         *            the name of the function
         * @param args
         *            the arguments
         * @return the return value if any
         */
        public static Object executeScript( String moduleName, String methodName, Object... args ) {
            JSObject module = (JSObject)wasmImports.getMember( moduleName );

            if( args != null ) {
                // JavaFX does not support our marker interface DOMString that 
                for( int i = 0, length = args.length; i < length; i++ ) {
                    if( args[i] instanceof DOMString ) {
                        args[i] = args[i].toString();
                    }
                }
            }
            return module.call( methodName, args );
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void start( Stage primaryStage ) throws Exception {
            stage = primaryStage;
        }

        /**
         * Load the page and run the start method
         */
        public static void execute() {
            // Create a WebView
            WebView browser = new WebView();

            // Get WebEngine via WebView
            webEngine = browser.getEngine();
            webEngine.setOnAlert( event -> {
                new Alert( Alert.AlertType.INFORMATION, event.getData() ).showAndWait();
            } );
            webEngine.setConfirmHandler( message -> {
                Optional<ButtonType> response = new Alert( Alert.AlertType.CONFIRMATION, message ).showAndWait();
                return response.isPresent() && response.get() == ButtonType.OK;
            } );
            // https://stackoverflow.com/questions/41654573/java-fx-javascript
            Worker<Void> worker = webEngine.getLoadWorker();
            worker.stateProperty().addListener( ( obs, old, neww ) -> {
                if( neww == Worker.State.SUCCEEDED ) {
                    try {
                        wasmImports = (JSObject)webEngine.executeScript( "wasmImports" );
                    } catch( JSException e ) {
                        webEngine.executeScript( "var wasmImports = {}" );
                        wasmImports = (JSObject)webEngine.executeScript( "wasmImports" );
                    }
                    // recreate the annotation in a new page
                    for( ImportAnnotation anno : ANNOTATIONS ) {
                        registerScript( anno );
                    }
                    try {
                        main.call();
                    } catch( Throwable th ) {
                        error = th;
                        th.printStackTrace();
                    }
                    //primaryStage.close();
                }
            } );
            // Load page
            if( content != null ) {
                webEngine.loadContent( content );
            } else {
                webEngine.load( url );
            }

            StackPane root = new StackPane();
            root.getChildren().add(browser);
            Scene scene = new Scene( root );

            stage.setTitle( "JWebAssembly Emulator" );
            stage.setScene( scene );
            stage.show();
        }

    }

    /**
     * Handler for callbacks from JavaScript
     */
    public static class CallbackHandler {

        /**
         * The callback. The parameter count must match the declaration in JavaScript
         * @param methodName the method name that is called
         */
        public void callback( String methodName, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8 ) throws Exception {
            System.err.println( methodName + " " + arg1 + " " + arg2 + " " + arg3);
            invoke( methodName, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
        }

        /**
         * The callback
         * @param methodName the method name that is called
         * @param args the arguments as array
         */
        private void invoke( String methodName, Object... args ) throws Exception {
            Object callback = callbacks.get( methodName );
            Method callbackMethod;
            if( callback instanceof String ) {
                callbackMethod = null;
                String signature = (String)callback;
                int idx1 = signature.indexOf( '.' );
                String className = signature.substring( 0, idx1 ).replace( '/', '.' );
                Class<?> clazz = Class.forName( className );
                for( Method method : clazz.getDeclaredMethods() ) {
                    if( methodName.equals( method.getName() ) ) {
                        callbackMethod = method;
                        callbacks.put( methodName, callbackMethod );
                        break;
                    }
                }
            } else {
                callbackMethod = (Method)callback;
            }
            callbackMethod.setAccessible( true );
            int paramCount = callbackMethod.getParameterTypes().length;
            args = Arrays.copyOf( args, paramCount );
            callbackMethod.invoke( null, args );
        }
    }

    private static CallbackHandler callbackHandler = new CallbackHandler();

    private static HashMap<String,Object> callbacks = new HashMap<>();
}
