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
package de.inetsoftware.jwebassembly.api.java.util;

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.util.TimeZone
 * 
 * @author Volker Berlin
 */
public class ReplacementForTimeZone {

    /**
     * Replacement for TimeZone.getSystemTimeZoneID(String)
     */
    @Replace( "java/util/TimeZone.getSystemTimeZoneID(Ljava/lang/String;)Ljava/lang/String;" )
    @Import( module = "System", js = "()=>Intl.DateTimeFormat().resolvedOptions().timeZone" )
    private static native String getSystemTimeZoneID(String javaHome);

    /**
     * Replacement for TimeZone.getSystemGMTOffsetID()
     */
    @Replace( "java/util/TimeZone.getSystemGMTOffsetID()Ljava/lang/String;" )
    private static String getSystemGMTOffsetID() {
        return null;
    }
}
