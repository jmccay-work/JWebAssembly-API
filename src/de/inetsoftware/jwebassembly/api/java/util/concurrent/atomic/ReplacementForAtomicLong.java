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
package de.inetsoftware.jwebassembly.api.java.util.concurrent.atomic;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

import de.inetsoftware.jwebassembly.api.annotation.Replace;

/**
 * Replacement for java.util.concurrent.atomic.AtomicLong without using of Unsafe.
 * TODO this class is not thread safe anymore. This must be rewritten if we supports threads.
 *
 * @author Volker Berlin
 */
@Replace( "java/util/concurrent/atomic/AtomicLong" )
public class ReplacementForAtomicLong extends Number implements java.io.Serializable {

    @Replace( "java/util/concurrent/atomic/AtomicLong.VMSupportsCS8()Z" )
    private static boolean VMSupportsCS8() {
        return true;
    }

    private volatile long value;

    public ReplacementForAtomicLong( long initialValue ) {
        value = initialValue;
    }

    public ReplacementForAtomicLong() {
    }

    public final long get() {
        return value;
    }

    public final void set( long newValue ) {
        value = newValue;
    }

    public final void lazySet( long newValue ) {
        value = newValue;
    }

    public final long getAndSet( long newValue ) {
        long oldValue = value;
        value = newValue;
        return oldValue;
    }

    public final boolean compareAndSet( long expect, long update ) {
        if( value == expect ) {
            value = update;
            return true;
        }
        return false;
    }

    public final boolean weakCompareAndSet( long expect, long update ) {
        if( value == expect ) {
            value = update;
            return true;
        }
        return false;
    }

    public final long getAndIncrement() {
        return value++;
    }

    public final long getAndDecrement() {
        return value--;
    }

    public final long getAndAdd( long delta ) {
        long oldValue = value;
        value = oldValue + delta;
        return oldValue;
    }

    public final long incrementAndGet() {
        return ++value;
    }

    public final long decrementAndGet() {
        return --value;
    }

    public final long addAndGet( long delta ) {
        long oldValue = value + delta;
        value = oldValue;
        return oldValue;
    }

    public final long getAndUpdate( LongUnaryOperator updateFunction ) {
        long prev, next;
        do {
            prev = get();
            next = updateFunction.applyAsLong( prev );
        } while( !compareAndSet( prev, next ) );
        return prev;
    }

    public final long updateAndGet( LongUnaryOperator updateFunction ) {
        long prev, next;
        do {
            prev = get();
            next = updateFunction.applyAsLong( prev );
        } while( !compareAndSet( prev, next ) );
        return next;
    }

    public final long getAndAccumulate( long x, LongBinaryOperator accumulatorFunction ) {
        long prev, next;
        do {
            prev = get();
            next = accumulatorFunction.applyAsLong( prev, x );
        } while( !compareAndSet( prev, next ) );
        return prev;
    }

    public final long accumulateAndGet( long x, LongBinaryOperator accumulatorFunction ) {
        long prev, next;
        do {
            prev = get();
            next = accumulatorFunction.applyAsLong( prev, x );
        } while( !compareAndSet( prev, next ) );
        return next;
    }

    public String toString() {
        return Long.toString( value );
    }

    public int intValue() {
        return (int)value;
    }

    public long longValue() {
        return value;
    }

    public float floatValue() {
        return (float)value;
    }

    public double doubleValue() {
        return (double)value;
    }
}
