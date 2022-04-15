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

/**
 * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document">https://developer.mozilla.org/en-US/docs/Web/API/Document</a>
 * 
 * @author Volker Berlin
 */
public class Document extends Node {

    /**
     * Create a Java instance as wrapper of the JavaScript object.
     * 
     * @param peer
     *            the native JavaScript object
     */
    Document( Object peer ) {
        super( peer );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement</a>
     * 
     * @param <T>
     *            the return type
     * @param tagName
     *            type of element
     * @return The new Element
     */
    public <T extends HTMLElement> T createElement( String tagName ) {
        return HTMLElement.createWrapper( tagName, invoke( "createElement", tagName ) );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode">https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode</a>
     * 
     * @param data
     *            the text data
     * @return the text node
     */
    public Text createTextNode( String data ) {
        return new Text( invoke( "createTextNode", data ) );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/body">https://developer.mozilla.org/en-US/docs/Web/API/Document/body</a>
     * 
     * @return the body
     */
    public HTMLElement body() {
        Object obj = get( "body" );
        if( obj == null ) {
            return null;
        }
        return new HTMLElement( obj );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/documentElement">https://developer.mozilla.org/en-US/docs/Web/API/Document/documentElement</a>
     * 
     * @return the element of the root
     */
    public HTMLElement documentElement() {
        return new HTMLElement( get( "documentElement" ) );
    }
}
