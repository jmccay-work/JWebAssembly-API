/*
 * Copyright 2021 Volker Berlin (i-net software)
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
package de.inetsoftware.jwebassembly.api.java.util.concurrent;

import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement java.util.concurrent.ConcurrentHashMap.
 * This implementation work without Unsafe an WebAssembly is single thread currently.
 *
 * @author Volker Berlin
 */
@Replace( "java/util/concurrent/ConcurrentHashMap" )
public class ReplacementForConcurrentHashMap<K,V> extends HashMap<K, V> implements ConcurrentMap<K,V> {

    public ReplacementForConcurrentHashMap() {
        //nothing
    }

    public ReplacementForConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) {
        super( initialCapacity, loadFactor );
    }
}
