/*
 * Copyright 2020 - 2022 Volker Berlin (i-net software)
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

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.lang.Object.
 * 
 * @author Volker Berlin
 */
class ReplacementForObject {

    /**
     * Replacement for {@link Object#hashCode()}
     */
    @Replace( "java/lang/Object.registerNatives()V" )
    private static void registerNatives() {
        // nothing
    }

    /**
     * Replacement for {@link Object#hashCode()}
     */
    @Replace( "java/lang/Object.hashCode()I" )
    static int hashCode(Object x) {
        return System.identityHashCode( x );
    }

    /**
     * Replacement for {@link Object#clone()}
     */
    @Import( js="(val)=>Object.assign({},val)")
    @Replace( "java/lang/Object.clone()Ljava/lang/Object;" )
    private static native Object clone0();

    /**
     * Replacement for {@link Object#notify()}
     */
    @Replace( "java/lang/Object.notify()V" )
    public final void notify0() {
        // nothing
    }

    /**
     * Replacement for {@link Object#notifyAll()}
     */
    @Replace( "java/lang/Object.notifyAll()V" )
    public final void notifyAll0() {
        // nothing
    }

    /**
     * Replacement for {@link Object#wait(long)}
     */
    @Replace( "java/lang/Object.wait(J)V" )
    public final void wait0(long timeout) {
        // nothing
    }
}
