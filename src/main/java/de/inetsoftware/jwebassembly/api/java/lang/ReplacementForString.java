/*
 * Copyright 2020 - 2021 Volker Berlin (i-net software)
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
import de.inetsoftware.jwebassembly.api.annotation.Partial;
import de.inetsoftware.jwebassembly.api.annotation.Replace;
import de.inetsoftware.jwebassembly.web.DOMString;

/**
 * Additional methods for the class java.lang.String.
 * 
 * @author Volker Berlin
 */
@Partial( "java/lang/String" )
class ReplacementForString {

    /**
     * hold the DOMString if there is already any
     */
    private DOMString domStr;

    /**
     * Create a DOMString via JavaScript from char array.
     * 
     * @param value
     *            the characters of the string
     * @return the DOMString
     */
    @Import( module = "Web", name = "fromChars", js = "(v)=>{" + //
                    "v=v[2];" + //
                    "var s='';" + //
                    "for(var i=0;i<v.length;i++){" + //
                    "s+=String.fromCharCode(v[i]);" + //
                    "}" + //
                    "return s}" )
    private static native DOMString fromChars( char[] value );

    /**
     * Getter and factory for DOMStrings.
     * @return the string
     */
    @Replace( "de/inetsoftware/jwebassembly/web/JSObject.domString(Ljava/lang/String;)Lde/inetsoftware/jwebassembly/web/DOMString;" )
    private Object domString() {
        DOMString domStr = this.domStr; 
        if( domStr == null ) {
            //TODO toCharArray() create a copy which we not need, but it work with Java 8 and 11. A better solution can be a multi release jar file.
            domStr = fromChars( toCharArray() );
            this.domStr = domStr;
        }
        return domStr;
    }

    /**
     * Convert a native String (JavaScript) to a character array and replace the characters in the given char[] object.
     * 
     * @param domStr
     *            the native String (JavaScript)
     * @param chars
     *            the target container for the characters
     */
    @Import( module = "Web", name = "toChars", js = "(d,s)=>{" + //
                    "var l=d.length;" + //
                    "var a=new Array(l);" + //
                    "for(var i=0;i<l;i++){a[i]=d.charCodeAt(i)}" + //
                    "s[2]=Object.seal(a)}" )
    private static native void toChars( Object domStr, char[] chars );

    /**
     * Convert the native string (JavaScript) into a Java String.
     * 
     * @param domStr
     *            the native string
     * @return the java string
     */
    @Replace( "de/inetsoftware/jwebassembly/web/JSObject.toJavaString(Ljava/lang/Object;)Ljava/lang/String;" )
    private static String toJavaString( Object domStr ) {
        // create a char arrays object
        char[] chars = new char[0];
        // inject the characters from the domStr
        toChars( domStr, chars );
        
        String str = new String( chars );
        //TODO cache the native string: str.domStr = domStr;
        return str;
    }

    /**
     * Placeholder for existing public method.
     */
    native public char[] toCharArray();

    /**
     * Replace native method.
     */
    public ReplacementForString intern() {
        return this;
    }
}
