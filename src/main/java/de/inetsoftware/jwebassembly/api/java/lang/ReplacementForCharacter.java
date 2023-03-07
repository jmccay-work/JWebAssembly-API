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

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.lang.Character.
 * 
 * @author Volker Berlin
 */
class ReplacementForCharacter {

    /**
     * Replacement for {@link Character.getName(int)}
     */
    @Replace( "java/lang/Character.getName(I)Ljava/lang/String;" )
    static String getName(int codePoint) {
        // not supported, need CharacterName which load a resource file via zip input which also not work
        throw new IllegalArgumentException();
    }

    /**
     * Replacement for {@link Character.codePointOf(String)}
     */
    @Replace( "java/lang/Character.codePointOf(Ljava/lang/String;)I" )
    static int codePointOf(String name) {
        // not supported, need CharacterName which load a resource file via zip input which also not work
        throw new IllegalArgumentException();
    }
}
