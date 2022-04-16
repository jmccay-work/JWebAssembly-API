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
package de.inetsoftware.jwebassembly.web.css;

import javax.annotation.Nonnull;

import de.inetsoftware.jwebassembly.web.JSObject;

/**
 * <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration">https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration</a>
 * 
 * @author Volker Berlin
 */
public class CSSStyleDeclaration extends JSObject {

    /**
     * @hidden
     * @param peer the native JavaScript object
     */
    public CSSStyleDeclaration( Object peer ) {
        super( peer );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/setProperty">https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/setProperty</a>
     * @param propertyName the property name
     * @param value the value
     */
    public void setProperty( @Nonnull String propertyName, String value ) {
        set( propertyName, value );
    }

    /* =====================================================
     * The CSS properties in alphabetical order
     * =====================================================*/

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-color">https://developer.mozilla.org/en-US/docs/Web/CSS/background-color</a>
     * @param value the value
     */
    public void setBackgroundColor( String value ) {
        set( "background-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-color">https://developer.mozilla.org/en-US/docs/Web/CSS/background-color</a>
     * @return the current value
     */
    public String getBackgroundColor() {
        return getStr( "background-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border">https://developer.mozilla.org/en-US/docs/Web/CSS/border</a>
     * @param value the value
     */
    public void setBorder( String value ) {
        set( "border", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border">https://developer.mozilla.org/en-US/docs/Web/CSS/border</a>
     * @return the current value
     */
    public String getBorder() {
        return getStr( "border" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/color">https://developer.mozilla.org/en-US/docs/Web/CSS/color</a>
     * @param value the value
     */
    public void setColor( String value ) {
        set( "color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/color">https://developer.mozilla.org/en-US/docs/Web/CSS/color</a>
     * @return the current value
     */
    public String getColor() {
        return getStr( "color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/display">https://developer.mozilla.org/en-US/docs/Web/CSS/display</a>
     * @param value the value
     */
    public void setDisplay( String value ) {
        set( "display", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/display">https://developer.mozilla.org/en-US/docs/Web/CSS/display</a>
     * @return the current value
     */
    public String getDisplay() {
        return getStr( "display" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex">https://developer.mozilla.org/en-US/docs/Web/CSS/flex</a>
     * 
     * @param value the value
     */
    public void setFlex( String value ) {
        set( "flex", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex">https://developer.mozilla.org/en-US/docs/Web/CSS/flex</a>
     * @return the current value
     */
    public String getFlex() {
        return getStr( "flex" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction">https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction</a>
     * 
     * @param value the value
     */
    public void setFlexDirection( String value ) {
        set( "flex-direction", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction">https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction</a>
     * @return the current value
     */
    public String getFlexDirection() {
        return getStr( "flex-direction" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap">https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap</a>
     * 
     * @param value the value
     */
    public void setFlexWrap( String value ) {
        set( "flex-wrap", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap">https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap</a>
     * @return the current value
     */
    public String getFlexWrap() {
        return getStr( "flex-wrap" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-size">https://developer.mozilla.org/en-US/docs/Web/CSS/font-size</a>
     * 
     * @param value the value
     */
    public void setFontSize( String value ) {
        set( "font-size", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-size">https://developer.mozilla.org/en-US/docs/Web/CSS/font-size</a>
     * @return the current value
     */
    public String getFontSize() {
        return getStr( "font-size" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/height">https://developer.mozilla.org/en-US/docs/Web/CSS/height</a>
     * 
     * @param value the value
     */
    public void setHeight( String value ) {
        set( "height", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/height">https://developer.mozilla.org/en-US/docs/Web/CSS/height</a>
     * @return the current value
     */
    public String getHeight() {
        return getStr( "height" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding">https://developer.mozilla.org/en-US/docs/Web/CSS/padding</a>
     * 
     * @param value the value
     */
    public void setPadding( String value ) {
        set( "padding", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding">https://developer.mozilla.org/en-US/docs/Web/CSS/padding</a>
     * @return the current value
     */
    public String getPadding() {
        return getStr( "padding" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-align">https://developer.mozilla.org/en-US/docs/Web/CSS/text-align</a>
     * 
     * @param value the value
     */
    public void setTextAlign( String value ) {
        set( "text-align", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-align">https://developer.mozilla.org/en-US/docs/Web/CSS/text-align</a>
     * @return the current value
     */
    public String getTextAlign() {
        return getStr( "text-align" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/width">https://developer.mozilla.org/en-US/docs/Web/CSS/width</a>
     * 
     * @param value the value
     */
    public void setWidth( String value ) {
        set( "width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/width">https://developer.mozilla.org/en-US/docs/Web/CSS/width</a>
     * @return the current value
     */
    public String getWidth() {
        return getStr( "width" );
    }
}
