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
 * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element">https://developer.mozilla.org/en-US/docs/Web/API/Element</a>
 * 
 * @author Volker Berlin
 */
public class Element extends Node {

    /**
     * Create a Java instance as wrapper of the JavaScript object.
     * 
     * @param peer
     *            the native JavaScript object
     */
    Element( Object peer ) {
        super( peer );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML">https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML</a>
     * @param value the value
     */
    public void setInnerHTML( String value ) {
        set( "innerHTML", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML">https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML</a>
     * @return the tag name
     */
    public String getInnerHTML() {
        return getStr( "innerHTML" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName">https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName</a>
     * @return the tag name
     */
    public String tagName() {
        return getStr( "tagName" );
    }
}
