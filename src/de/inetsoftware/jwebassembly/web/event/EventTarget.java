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
package de.inetsoftware.jwebassembly.web.event;

import javax.annotation.Nonnull;

import de.inetsoftware.jwebassembly.api.annotation.Import;
import de.inetsoftware.jwebassembly.web.DOMString;
import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget
 * 
 * @author Volker Berlin
 */
public class EventTarget extends JSObject {

    /**
     * Create a Java instance as wrapper of the JavaScript object.
     * 
     * @param peer
     *            the native JavaScript object
     */
    protected EventTarget( Object peer ) {
        super( peer );
    }

    /**
     * Callback for the listener for an registered EventListener. Will be exported if addEventListener0 is used.
     * 
     * @param listener
     *            the listener
     * @param event
     *            the event
     */
    private static void wasm_dispatchEvent( EventListener listener, Object event ) {
        listener.handleEvent( new Event( event ) );
    }

    /**
     * Add an listener
     * 
     * @param peer
     *            the JavaScript object
     * @param type
     *            the event type
     * @param listener
     *            the listener
     */
    @Import( module = WEB, js = "(o,t,l)=>o.addEventListener(t,e=>{console.log('log: ' + e);wasmImports.instance.exports.wasm_dispatchEvent(l,e)})", //
                    callbacks = "de/inetsoftware/jwebassembly/web/event/EventTarget.wasm_dispatchEvent(Lde/inetsoftware/jwebassembly/web/event/EventListener;Ljava/lang/Object;)V" )
    private native static void addEventListener0( Object peer, DOMString type, EventListener listener );

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
     * 
     * @param type
     *            the event type
     * @param listener
     *            the listener
     */
    public void addEventListener( @Nonnull String type, EventListener listener ) {
        addEventListener0( peer, domString( type ), listener );
    }
}
