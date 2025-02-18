/*
 * Copyright 2022 Volker Berlin (i-net software)
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
package de.inetsoftware.jwebassembly.api.java.lang;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.web.DOMString;
import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * Wrapper for the JavaScript console and the PrintStream interface
 * 
 * @author Volker Berlin
 */
public class JavaScriptConsole extends PrintStream {

    @Import( js = "(o) => {console.log('log: ' + o)}" )
    private static void print( DOMString o ) {
        System.out.println( o );
    }

    /**
     * Create an instance
     */
    JavaScriptConsole() {
        // OutputStream only to pass the null check
        super( new OutputStream() {

            @Override
            public void write( int b ) throws IOException {
                // should never call
            }
        } );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void print( String s ) {
        print( JSObject.domString( s ) );
    }
}
