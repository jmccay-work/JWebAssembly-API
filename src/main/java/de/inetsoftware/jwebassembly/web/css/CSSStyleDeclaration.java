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
     * @param peer the native JavaScript object
     */
    public CSSStyleDeclaration( Object peer ) {
        super( peer );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/cssText">https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/cssText</a>
     * @param value the value
     */
    public void setCssText( String value ) {
        set( "cssText", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/cssText">https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/cssText</a>
     * @return the current value
     */
    public String getCssText() {
        return getStr( "cssText" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/length">https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/length</a>
     * @return the current value
     */
    public int getLength() {
        return getInt( "length" );
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
     * https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference
     * https://developer.mozilla.org/en-US/docs/Web/CSS/Reference
     * =====================================================*/

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background">https://developer.mozilla.org/en-US/docs/Web/CSS/background</a>
     * @param value the value
     */
    public void setBackground( String value ) {
        set( "background", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background">https://developer.mozilla.org/en-US/docs/Web/CSS/background</a>
     * @return the current value
     */
    public String getBackground() {
        return getStr( "background" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment">https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment</a>
     * @param value the value
     */
    public void setBackgroundAttachment( String value ) {
        set( "background-attachment", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment">https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment</a>
     * @return the current value
     */
    public String getBackgroundAttachment() {
        return getStr( "background-attachment" );
    }

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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-image">https://developer.mozilla.org/en-US/docs/Web/CSS/background-image</a>
     * @param value the value
     */
    public void setBackgroundImage( String value ) {
        set( "background-image", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-image">https://developer.mozilla.org/en-US/docs/Web/CSS/background-image</a>
     * @return the current value
     */
    public String getBackgroundImage() {
        return getStr( "background-image" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-position">https://developer.mozilla.org/en-US/docs/Web/CSS/background-position</a>
     * @param value the value
     */
    public void setBackgroundPosition( String value ) {
        set( "background-position", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-position">https://developer.mozilla.org/en-US/docs/Web/CSS/background-position</a>
     * @return the current value
     */
    public String getBackgroundPosition() {
        return getStr( "background-position" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat">https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat</a>
     * @param value the value
     */
    public void setBackgroundRepeat( String value ) {
        set( "background-repeat", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat">https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat</a>
     * @return the current value
     */
    public String getBackgroundRepeat() {
        return getStr( "background-repeat" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom</a>
     * @param value the value
     */
    public void setBorderBottom( String value ) {
        set( "border-bottom", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom</a>
     * @return the current value
     */
    public String getBorderBottom() {
        return getStr( "border-bottom" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color</a>
     * @param value the value
     */
    public void setBorderBottomColor( String value ) {
        set( "border-bottom-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color</a>
     * @return the current value
     */
    public String getBorderBottomColor() {
        return getStr( "border-bottom-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style</a>
     * @param value the value
     */
    public void setBorderBottomStyle( String value ) {
        set( "border-bottom-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style</a>
     * @return the current value
     */
    public String getBorderBottomStyle() {
        return getStr( "border-bottom-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width</a>
     * @param value the value
     */
    public void setBorderBottomWidth( String value ) {
        set( "border-bottom-width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width</a>
     * @return the current value
     */
    public String getBorderBottomWidth() {
        return getStr( "border-bottom-width" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-color</a>
     * @param value the value
     */
    public void setBorderColor( String value ) {
        set( "border-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-color</a>
     * @return the current value
     */
    public String getBorderColor() {
        return getStr( "border-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left</a>
     * @param value the value
     */
    public void setBorderLeft( String value ) {
        set( "border-left", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left</a>
     * @return the current value
     */
    public String getBorderLeft() {
        return getStr( "border-left" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color</a>
     * @param value the value
     */
    public void setBorderLeftColor( String value ) {
        set( "border-left-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color</a>
     * @return the current value
     */
    public String getBorderLeftColor() {
        return getStr( "border-left-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style</a>
     * @param value the value
     */
    public void setBorderLeftStyle( String value ) {
        set( "border-left-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style</a>
     * @return the current value
     */
    public String getBorderLeftStyle() {
        return getStr( "border-left-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width</a>
     * @param value the value
     */
    public void setBorderLeftWidth( String value ) {
        set( "border-left-width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width</a>
     * @return the current value
     */
    public String getBorderLeftWidth() {
        return getStr( "border-left-width" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right</a>
     * @param value the value
     */
    public void setBorderRight( String value ) {
        set( "border-right", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right</a>
     * @return the current value
     */
    public String getBorderRight() {
        return getStr( "border-right" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color</a>
     * @param value the value
     */
    public void setBorderRightColor( String value ) {
        set( "border-right-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color</a>
     * @return the current value
     */
    public String getBorderRightColor() {
        return getStr( "border-right-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style</a>
     * @param value the value
     */
    public void setBorderRightStyle( String value ) {
        set( "border-right-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style</a>
     * @return the current value
     */
    public String getBorderRightStyle() {
        return getStr( "border-right-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width</a>
     * @param value the value
     */
    public void setBorderRightWidth( String value ) {
        set( "border-right-width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width</a>
     * @return the current value
     */
    public String getBorderRightWidth() {
        return getStr( "border-right-width" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-style</a>
     * @param value the value
     */
    public void setBorderStyle( String value ) {
        set( "border-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-style</a>
     * @return the current value
     */
    public String getBorderStyle() {
        return getStr( "border-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top</a>
     * @param value the value
     */
    public void setBorderTop( String value ) {
        set( "border-top", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top</a>
     * @return the current value
     */
    public String getBorderTop() {
        return getStr( "border-top" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color</a>
     * @param value the value
     */
    public void setBorderTopColor( String value ) {
        set( "border-top-color", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color</a>
     * @return the current value
     */
    public String getBorderTopColor() {
        return getStr( "border-top-color" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style</a>
     * @param value the value
     */
    public void setBorderTopStyle( String value ) {
        set( "border-top-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style</a>
     * @return the current value
     */
    public String getBorderTopStyle() {
        return getStr( "border-top-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width</a>
     * @param value the value
     */
    public void setBorderTopWidth( String value ) {
        set( "border-top-width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width</a>
     * @return the current value
     */
    public String getBorderTopWidth() {
        return getStr( "border-top-width" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-width</a>
     * @param value the value
     */
    public void setBorderWidth( String value ) {
        set( "border-width", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/border-width">https://developer.mozilla.org/en-US/docs/Web/CSS/border-width</a>
     * @return the current value
     */
    public String getBorderWidth() {
        return getStr( "border-width" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/clear">https://developer.mozilla.org/en-US/docs/Web/CSS/clear</a>
     * @param value the value
     */
    public void setClear( String value ) {
        set( "clear", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/clear">https://developer.mozilla.org/en-US/docs/Web/CSS/clear</a>
     * @return the current value
     */
    public String getClear() {
        return getStr( "clear" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/clip">https://developer.mozilla.org/en-US/docs/Web/CSS/clip</a>
     * @param value the value
     */
    public void setClip( String value ) {
        set( "clip", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/clip">https://developer.mozilla.org/en-US/docs/Web/CSS/clip</a>
     * @return the current value
     */
    public String getClip() {
        return getStr( "clip" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/cursor">https://developer.mozilla.org/en-US/docs/Web/CSS/cursor</a>
     * @param value the value
     */
    public void setCursor( String value ) {
        set( "cursor", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/cursor">https://developer.mozilla.org/en-US/docs/Web/CSS/cursor</a>
     * @return the current value
     */
    public String getCursor() {
        return getStr( "cursor" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/filter">https://developer.mozilla.org/en-US/docs/Web/CSS/filter</a>
     * @param value the value
     */
    public void setFilter( String value ) {
        set( "filter", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/filter">https://developer.mozilla.org/en-US/docs/Web/CSS/filter</a>
     * @return the current value
     */
    public String getFilter() {
        return getStr( "filter" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/float">https://developer.mozilla.org/en-US/docs/Web/CSS/float</a>
     * 
     * @param value the value
     */
    public void setFloat( String value ) {
        set( "float", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/float">https://developer.mozilla.org/en-US/docs/Web/CSS/float</a>
     * @return the current value
     */
    public String getFloat() {
        return getStr( "float" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font">https://developer.mozilla.org/en-US/docs/Web/CSS/font</a>
     * 
     * @param value the value
     */
    public void setFont( String value ) {
        set( "font", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font">https://developer.mozilla.org/en-US/docs/Web/CSS/font</a>
     * @return the current value
     */
    public String getFont() {
        return getStr( "font" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-family">https://developer.mozilla.org/en-US/docs/Web/CSS/font-family</a>
     * 
     * @param value the value
     */
    public void setFontFamily( String value ) {
        set( "font-family", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-family">https://developer.mozilla.org/en-US/docs/Web/CSS/font-family</a>
     * @return the current value
     */
    public String getFontFamily() {
        return getStr( "font-family" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant">https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant</a>
     * 
     * @param value the value
     */
    public void setFontVariant( String value ) {
        set( "font-variant", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant">https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant</a>
     * @return the current value
     */
    public String getFontVariant() {
        return getStr( "font-variant" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight">https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight</a>
     * 
     * @param value the value
     */
    public void setFontWeight( String value ) {
        set( "font-weight", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight">https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight</a>
     * @return the current value
     */
    public String getFontWeight() {
        return getStr( "font-weight" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/left">https://developer.mozilla.org/en-US/docs/Web/CSS/left</a>
     * 
     * @param value the value
     */
    public void setLeft( String value ) {
        set( "left", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/left">https://developer.mozilla.org/en-US/docs/Web/CSS/left</a>
     * @return the current value
     */
    public String getLeft() {
        return getStr( "left" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing">https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing</a>
     * 
     * @param value the value
     */
    public void setLetterSpacing( String value ) {
        set( "letter-spacing", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing">https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing</a>
     * @return the current value
     */
    public String getLetterSpacing() {
        return getStr( "letter-spacing" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/line-height">https://developer.mozilla.org/en-US/docs/Web/CSS/line-height</a>
     * 
     * @param value the value
     */
    public void setLineHeight( String value ) {
        set( "line-height", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/line-height">https://developer.mozilla.org/en-US/docs/Web/CSS/line-height</a>
     * @return the current value
     */
    public String getLineHeight() {
        return getStr( "line-height" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style</a>
     * 
     * @param value the value
     */
    public void setListStyle( String value ) {
        set( "list-style", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style</a>
     * @return the current value
     */
    public String getListStyle() {
        return getStr( "list-style" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-image">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-image</a>
     * 
     * @param value the value
     */
    public void setListStyleImage( String value ) {
        set( "list-style-image", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-image">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-image</a>
     * @return the current value
     */
    public String getListStyleImage() {
        return getStr( "list-style-image" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position</a>
     * 
     * @param value the value
     */
    public void setListStylePosition( String value ) {
        set( "list-style-position", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-position</a>
     * @return the current value
     */
    public String getListStylePosition() {
        return getStr( "list-style-position" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type</a>
     * 
     * @param value the value
     */
    public void setListStyleType( String value ) {
        set( "list-style-type", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type">https://developer.mozilla.org/en-US/docs/Web/CSS/list-style-type</a>
     * @return the current value
     */
    public String getListStyleType() {
        return getStr( "list-style-type" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin">https://developer.mozilla.org/en-US/docs/Web/CSS/margin</a>
     * 
     * @param value the value
     */
    public void setMargin( String value ) {
        set( "margin", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin">https://developer.mozilla.org/en-US/docs/Web/CSS/margin</a>
     * @return the current value
     */
    public String getMargin() {
        return getStr( "margin" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom</a>
     * 
     * @param value the value
     */
    public void setMarginBottom( String value ) {
        set( "margin-bottom", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom</a>
     * @return the current value
     */
    public String getMarginBottom() {
        return getStr( "margin-bottom" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left</a>
     * 
     * @param value the value
     */
    public void setMarginLeft( String value ) {
        set( "margin-left", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left</a>
     * @return the current value
     */
    public String getMarginLeft() {
        return getStr( "margin-left" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right</a>
     * 
     * @param value the value
     */
    public void setMarginRight( String value ) {
        set( "margin-right", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-right</a>
     * @return the current value
     */
    public String getMarginRight() {
        return getStr( "margin-right" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top</a>
     * 
     * @param value the value
     */
    public void setMarginTop( String value ) {
        set( "margin-top", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top">https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top</a>
     * @return the current value
     */
    public String getMarginTop() {
        return getStr( "margin-top" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/overflow">https://developer.mozilla.org/en-US/docs/Web/CSS/overflow</a>
     * 
     * @param value the value
     */
    public void setOverflow( String value ) {
        set( "overflow", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/overflow">https://developer.mozilla.org/en-US/docs/Web/CSS/overflow</a>
     * @return the current value
     */
    public String getOverflow() {
        return getStr( "overflow" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom</a>
     * 
     * @param value the value
     */
    public void setPaddingBottom( String value ) {
        set( "padding-bottom", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom</a>
     * @return the current value
     */
    public String getPaddingBottom() {
        return getStr( "padding-bottom" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left</a>
     * 
     * @param value the value
     */
    public void setPaddingLeft( String value ) {
        set( "padding-left", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-left</a>
     * @return the current value
     */
    public String getPaddingLeft() {
        return getStr( "padding-left" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right</a>
     * 
     * @param value the value
     */
    public void setPaddingRight( String value ) {
        set( "padding-right", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-right</a>
     * @return the current value
     */
    public String getPaddingRight() {
        return getStr( "padding-right" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top</a>
     * 
     * @param value the value
     */
    public void setPaddingTop( String value ) {
        set( "padding-top", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top">https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top</a>
     * @return the current value
     */
    public String getPaddingTop() {
        return getStr( "padding-top" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after">https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after</a>
     * 
     * @param value the value
     */
    public void setPageBreakAfter( String value ) {
        set( "page-break-after", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after">https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-after</a>
     * @return the current value
     */
    public String getPageBreakAfter() {
        return getStr( "page-break-after" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before">https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before</a>
     * 
     * @param value the value
     */
    public void setPageBreakBefore( String value ) {
        set( "page-break-before", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before">https://developer.mozilla.org/en-US/docs/Web/CSS/page-break-before</a>
     * @return the current value
     */
    public String getPageBreakBefore() {
        return getStr( "page-break-before" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/position">https://developer.mozilla.org/en-US/docs/Web/CSS/position</a>
     * 
     * @param value the value
     */
    public void setPosition( String value ) {
        set( "position", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/position">https://developer.mozilla.org/en-US/docs/Web/CSS/position</a>
     * @return the current value
     */
    public String getPosition() {
        return getStr( "position" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dasharray">https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dasharray</a>
     * 
     * @param value the value
     */
    public void setStrokeDasharray( String value ) {
        set( "stroke-dasharray", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dasharray">https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dasharray</a>
     * @return the current value
     */
    public String getStrokeDasharray() {
        return getStr( "stroke-dasharray" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dashoffset">https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dashoffset</a>
     * 
     * @param value the value
     */
    public void setStrokeDasoffset( String value ) {
        set( "stroke-dashoffset", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dashoffset">https://developer.mozilla.org/en-US/docs/Web/CSS/stroke-dashoffset</a>
     * @return the current value
     */
    public String getStrokeDashoffset() {
        return getStr( "stroke-dashoffset" );
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
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration">https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration</a>
     * 
     * @param value the value
     */
    public void setTextDecoration( String value ) {
        set( "text-decoration", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration">https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration</a>
     * @return the current value
     */
    public String getTextDecoration() {
        return getStr( "text-decoration" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-indent">https://developer.mozilla.org/en-US/docs/Web/CSS/text-indent</a>
     * 
     * @param value the value
     */
    public void setTextIndent( String value ) {
        set( "text-indent", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-indent">https://developer.mozilla.org/en-US/docs/Web/CSS/text-indent</a>
     * @return the current value
     */
    public String getTextIndent() {
        return getStr( "text-indent" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform">https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform</a>
     * 
     * @param value the value
     */
    public void setTextTransform( String value ) {
        set( "text-transform", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform">https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform</a>
     * @return the current value
     */
    public String getTextTransform() {
        return getStr( "text-transform" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/top">https://developer.mozilla.org/en-US/docs/Web/CSS/top</a>
     * 
     * @param value the value
     */
    public void setTop( String value ) {
        set( "top", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/top">https://developer.mozilla.org/en-US/docs/Web/CSS/top</a>
     * @return the current value
     */
    public String getTop() {
        return getStr( "top" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align">https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align</a>
     * 
     * @param value the value
     */
    public void setVerticalAlign( String value ) {
        set( "vertical-align", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align">https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align</a>
     * @return the current value
     */
    public String getVerticalAlign() {
        return getStr( "vertical-align" );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/visibility">https://developer.mozilla.org/en-US/docs/Web/CSS/visibility</a>
     * 
     * @param value the value
     */
    public void setVisibility( String value ) {
        set( "visibility", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/visibility">https://developer.mozilla.org/en-US/docs/Web/CSS/visibility</a>
     * @return the current value
     */
    public String getVisibility() {
        return getStr( "visibility" );
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

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/z-index">https://developer.mozilla.org/en-US/docs/Web/CSS/z-index</a>
     * 
     * @param value the value
     */
    public void setZIndex( String value ) {
        set( "z-index", value );
    }

    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/z-index">https://developer.mozilla.org/en-US/docs/Web/CSS/z-index</a>
     * @return the current value
     */
    public String getZIndex() {
        return getStr( "z-index" );
    }
}
