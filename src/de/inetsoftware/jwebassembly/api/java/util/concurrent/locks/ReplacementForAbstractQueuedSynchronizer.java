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
package de.inetsoftware.jwebassembly.api.java.util.concurrent.locks;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement methods for the class java.util.concurrent.locks.AbstractQueuedSynchronizer.
 * 
 * @author Volker Berlin
 */
class ReplacementForAbstractQueuedSynchronizer {

    /**
     * Replacement for static code.
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.<clinit>()V" )
    private static void init() {
        // nothing
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.addWaiter(Node).
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.compareAndSetState(II)Z" )
    boolean compareAndSetState(int expect, int update) {
        return true;
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.addWaiter(Node).
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.addWaiter(Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;)Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;" )
    private Object addWaiter(Object mode) {
        return mode;
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.unparkSuccessor(Node).
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.unparkSuccessor(Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;)V" )
    private void unparkSuccessor(Object node) {
        //nothing
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.hasQueuedThreads().
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.shouldParkAfterFailedAcquire(Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;)Z" )
    private static boolean shouldParkAfterFailedAcquire(Object pred, Object node) {
        return false;
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.acquireQueued(node,int).
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.cancelAcquire(Ljava/util/concurrent/locks/AbstractQueuedSynchronizer$Node;)V" )
    boolean acquireQueued(final Object node, int arg) {
        return false;
    }

    /**
     * Replacement for AbstractQueuedSynchronizer.hasQueuedThreads().
     */
    @Replace( "java/util/concurrent/locks/AbstractQueuedSynchronizer.hasQueuedThreads()Z" )
    boolean hasQueuedThreads() {
        return false;
    }
}
