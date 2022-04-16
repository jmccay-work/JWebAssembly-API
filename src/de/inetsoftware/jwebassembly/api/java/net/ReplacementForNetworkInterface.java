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

import java.net.NetworkInterface;
import java.net.SocketException;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.net.NetworkInterface.
 * 
 * @author Volker Berlin
 */
public class ReplacementForNetworkInterface {

    /**
     * Replacement for static code.
     */
    @Replace( "java/net/NetworkInterface.<clinit>()V" )
    private static void _init() {
        // nothing
    }

    /**
     * Replacement for NetworkInterface.init()
     */
    @Replace( "java/net/NetworkInterface.init()V" )
    private static void init() {
        // nothing
    }

    /**
     * Replacement for NetworkInterface.getByName(String)
     */
    @Replace( "java/net/NetworkInterface.getByName(Ljava/lang/String;)Ljava/net/NetworkInterface;" )
    public static NetworkInterface getByName(String name) {
        return null;
    }

    /**
     * Replacement for NetworkInterface.getByIndex(int)
     */
    @Replace( "java/net/NetworkInterface.getByIndex(I)Ljava/net/NetworkInterface;" )
    public static NetworkInterface getByIndex(int index) {
        return null;
    }
}
