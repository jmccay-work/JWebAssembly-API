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
package de.inetsoftware.jwebassembly.api.jdk.internal.reflect;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class sun.reflect.Reflection.
 *
 * @author Volker Berlin
 */
public class ReplacementForReflection {

    /**
     * Replacement for verifyMemberAccess().
     * 
     * @return ever true
     */
    @Replace( "jdk/internal/reflect/Reflection.verifyMemberAccess(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;I)Z" )
    static boolean verifyMemberAccess( Class<?> currentClass, Class<?> memberClass, Class<?> targetClass, int modifiers ) {
        return true;
    }

    /**
     * Replacement for getCallerClass().
     * 
     * @return ever Class.class
     */
    @Replace( "jdk/internal/reflect/Reflection.getCallerClass()Ljava/lang/Class;" )
    static Class<?> getCallerClass() {
        return Class.class;
    }

    /**
     * Replacement for getClassAccessFlags().
     */
    @Replace( "jdk/internal/reflect/Reflection.getClassAccessFlags(Ljava/lang/Class;)I" )
    static int getClassAccessFlags( Class<?> c ) {
        return 0;
    }
}
