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
package de.inetsoftware.jwebassembly.api.java.lang;

import java.io.PrintStream;
import java.util.Properties;

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.api.annotation.Partial;
import de.inetsoftware.jwebassembly.api.annotation.Replace;
import de.inetsoftware.jwebassembly.api.annotation.WasmTextCode;

/**
 * Replacement methods for the class java.lang.System.
 * 
 * @author Volker Berlin
 */
@Partial( value = "java/lang/System" )
class ReplacementForSystem {

    private static Properties props;

    /**
     * Replacement for static code.
     */
    @Replace( "java/lang/System.<clinit>()V" )
    private static void init() {
        /*
        JavaScriptConsole console = new JavaScriptConsole();
        System.setOut( console );
        System.setErr( console );
        */
        props = new Properties();
    }

    @WasmTextCode( value = "local.get 0 " + //
                    "global.set $java/lang/System.out" )
    static native void setOut(PrintStream out);

    @WasmTextCode( value = "local.get 0 " + //
                    "global.set $java/lang/System.err" )
    static native void setErr( PrintStream err );

    /**
     * Replacement for System.registerNatives()
     */
    private static void registerNatives() {
        // nothing
    }

    /**
     * Replacement for System.currentTimeMillis()
     */
    @Import( module = "System", name = "currentTimeMillis", js = "()=>BigInt(Date.now())")
    static native long currentTimeMillis();

    /**
     * Replacement for System.nanoTime()
     */
    @Import( module = "System", name = "nanoTime", js = "()=>BigInt(Date.now()*1000000)")
    static native long nanoTime();

    /**
     * Replacement for {@link System#arraycopy(Object, int, Object, int, int)}
     */
    @Import( js = "(src,srcPos,dest,destPos,length)=>{" + //
                    "src=src[2];" + //
                    "dest=dest[2];" + //
                    "if(destPos<srcPos){" + //
                    "for (var i=0;i<length;i++)dest[i+destPos]=src[i+srcPos];" + //
                    "}else{" + //
                    "for (var i=length-1;i>=0;i--)dest[i+destPos]=src[i+srcPos];" + //
                    "}" + //
                    "}" )
    static native void arraycopy();

    /**
     * Replacement for {@link System#identityHashCode(Object)}
     */
    @Import( module = "NonGC", name = "identityHashCode", js = "(o)=>{" //
                    + "var h=o[1];" // 
                    + "while(h==0){" //
                    + "o[1]=h=Math.round((Math.random()-0.5)*0xffff);" //
                    + "}" // 
                    + "return h}" )
    static native int identityHashCode(Object x);

    /**
     * Replacement for {@link System#exit(int)}
     */
    public static void exit(int status) {
        // nothing
    }
}
