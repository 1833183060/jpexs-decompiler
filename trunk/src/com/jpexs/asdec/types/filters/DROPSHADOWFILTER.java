/*
 *  Copyright (C) 2010 JPEXS
 * 
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.jpexs.asdec.types.filters;

import com.jpexs.asdec.types.RGBA;

/**
 * Drop shadow filter based on the same median filter as the blur filter
 *
 * @author JPEXS
 */
public class DROPSHADOWFILTER extends FILTER {
    /**
     * Color of the shadow
     */
    public RGBA dropShadowColor;
    /**
     * Horizontal blur amount
     */
    public double blurX;
    /**
     * Vertical blur amount
     */
    public double blurY;
    /**
     * Radian angle of the drop shadow
     */
    public double angle;
    /**
     * Distance of the drop shadow
     */
    public double distance;
    /**
     * Strength of the drop shadow
     */
    public float strength;
    /**
     * Inner shadow mode
     */
    public boolean innerShadow;
    /**
     * Knockout mode
     */
    public boolean knockout;
    /**
     * Composite source
     */
    public boolean compositeSource;
    /**
     * Number of blur passes
     */
    public int passes;

    /**
     * Constructor
     */
    public DROPSHADOWFILTER() {
        super(0);
    }
}
