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

package com.jpexs.asdec.abc.avm2.treemodel.operations;

import com.jpexs.asdec.abc.avm2.ConstantPool;
import com.jpexs.asdec.abc.avm2.instructions.AVM2Instruction;
import com.jpexs.asdec.abc.avm2.treemodel.FullMultinameTreeItem;
import com.jpexs.asdec.abc.avm2.treemodel.TreeItem;


public class DeletePropertyTreeItem extends TreeItem {
    public TreeItem object;
    public FullMultinameTreeItem propertyName;

    public DeletePropertyTreeItem(AVM2Instruction instruction, TreeItem object, FullMultinameTreeItem propertyName) {
        super(instruction, PRECEDENCE_UNARY);
        this.object = object;
        this.propertyName = propertyName;
    }

    @Override
    public String toString(ConstantPool constants) {
        return hilight("delete ") + object.toString(constants) + "[" + propertyName.toString(constants) + "]";
    }


}
