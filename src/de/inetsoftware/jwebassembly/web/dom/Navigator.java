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
package de.inetsoftware.jwebassembly.web.dom;

import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * <a href="https://developer.mozilla.org/de/docs/Web/API/Navigator">https://developer.mozilla.org/de/docs/Web/API/Navigator</a>
 *
 * @author Volker Berlin
 */
public class Navigator extends JSObject {

    /**
     * Create a Java instance as wrapper of the JavaScript object.
     * 
     * @param peer
     *            the native JavaScript object
     */
    Navigator( Object peer ) {
        super( peer );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/language">https://developer.mozilla.org/en-US/docs/Web/API/Navigator/language</a>
     * 
     * @return the language
     */
    public String language() {
        return getStr( "language" );
    }
}
