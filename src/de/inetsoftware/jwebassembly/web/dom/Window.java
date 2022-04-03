/*
 * Copyright 2019 - 2022 Volker Berlin (i-net software)
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
package de.inetsoftware.jwebassembly.web.dom;

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.web.DOMString;
import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Window
 * 
 * @author Volker Berlin
 */
public abstract class Window extends JSObject {

    /**
     * Create a Java instance as wrapper of the JavaScript object.
     * 
     * @param peer
     *            the native JavaScript object
     */
    Window( Object peer ) {
        super( peer );
    }

    /**
     * Native invoke a JavaScript method on window object with one parameter.
     * 
     * @param <T>
     *            the return type
     * @param methodName
     *            the method name
     * @param param1
     *            the parameter
     * @return the return value
     */
    @Import( module = WEB, js = "(m,p1)=>window[m](p1)" )
    private static native <T> T win_invoke0( DOMString methodName, Object param1 );

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Window/document
     * 
     * @return the document
     */
    public static Document document() {
        return new Document( win_get( "document" ) );
    }

    /**
     * Display a dialog with n message.
     * 
     * @param msg
     *            the message
     */
    public static void alert( Object msg ) {
        win_invoke0( domString( "alert" ), domString( String.valueOf( msg ) ) );
    }
}
