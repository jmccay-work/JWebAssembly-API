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
package de.inetsoftware.jwebassembly.api.java.net;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.net.Inet4Address.
 * 
 * @author Volker Berlin
 */
public class ReplacementForInet4Address {

    /**
     * Replacement for static code.
     */
    @Replace( "java/net/Inet4Address.<clinit>()V" )
    private static void _init() {
        // nothing
    }

    /**
     * Replacement for Inet4Address.init()
     */
    @Replace( "java/net/Inet4Address.init()V" )
    private static void init() {
        // nothing
    }
}
