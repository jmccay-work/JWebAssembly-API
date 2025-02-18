/*
 * Copyright 2021 - 2022 Volker Berlin (i-net software)
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

import java.security.Permission;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.lang.SecurityManager.
 * 
 * We does not want use a SecurityManager and we does not want compile all the classes that the SecurityManager need that we override it with a stub.
 * 
 * @author Volker Berlin
 */
class ReplacementForSecurityManager {

    /**
     * Replacement for static code.
     */
    @Replace( "java/lang/SecurityManager.<clinit>()V" )
    private static void init() {
        // nothing
    }

    /**
     * Replacement for {@link SecurityManager#checkPermission(Permission)}
     */
    @Replace( "java/lang/SecurityManager.<init>()V" )
    public ReplacementForSecurityManager() {
        throw new SecurityException();
    }

    /**
     * Replacement for {@link SecurityManager#checkPermission(Permission)}
     */
    @Replace( "java/lang/SecurityManager.checkPermission(Ljava/security/Permission;)V" )
    public void checkPermission(Permission perm) {
        // nothing
    }

    /**
     * Replacement for {@link SecurityManager#getClassContext()}
     */
    @Replace( "java/lang/SecurityManager.getClassContext()[Ljava/lang/Class;" )
    protected Class[] getClassContext() {
        return null;
    }

    /**
     * Replacement for {@link SecurityManager#checkAccess(Thread)}
     */
    @Replace( "java/lang/SecurityManager.checkAccess(Ljava/lang/Thread;)V" )
    public void checkAccess(Thread t) {
        // nothing
    }

    /**
     * Replacement for {@link SecurityManager#checkAccess(ThreadGroup)}
     */
    @Replace( "java/lang/SecurityManager.checkAccess(Ljava/lang/ThreadGroup;)V" )
    public void checkAccess(ThreadGroup g) {
        // nothing
    }

    /**
     * Replacement for {@link SecurityManager#checkRead(String)}
     */
    @Replace( "java/lang/SecurityManager.checkRead(Ljava/lang/String;)V" )
    public void checkRead(String file) {
        // nothing
    }
}
