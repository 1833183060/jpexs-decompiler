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

package com.jpexs.asdec.abc.avm2.instructions.arithmetic;

import com.jpexs.asdec.abc.avm2.ConstantPool;
import com.jpexs.asdec.abc.avm2.LocalDataArea;
import com.jpexs.asdec.abc.avm2.instructions.AVM2Instruction;
import com.jpexs.asdec.abc.avm2.instructions.InstructionDefinition;
import com.jpexs.asdec.abc.avm2.treemodel.DecrementTreeItem;
import com.jpexs.asdec.abc.avm2.treemodel.TreeItem;
import com.jpexs.asdec.abc.types.MethodInfo;

import java.util.List;
import java.util.Stack;


public class DecrementIIns extends InstructionDefinition {

    public DecrementIIns() {
        super(0xc1, "decrement_i", new int[]{});
    }

    @Override
    public void execute(LocalDataArea lda, ConstantPool constants, List arguments) {
        Object obj = lda.operandStack.pop();
        if (obj instanceof Long) {
            Long obj2 = ((Long) obj).longValue() - 1;
            lda.operandStack.push(obj2);
        } else if (obj instanceof Double) {
            Double obj2 = ((Double) obj).doubleValue() - 1;
            lda.operandStack.push(obj2);
        }
        if (obj instanceof String) {
            Double obj2 = Double.parseDouble((String) obj) - 1;
            lda.operandStack.push(obj2);
        } else {
            throw new RuntimeException("Cannot decrement local register");
        }
    }

    @Override
    public void translate(boolean isStatic, int classIndex, java.util.HashMap<Integer, TreeItem> localRegs, Stack<TreeItem> stack, java.util.Stack<TreeItem> scopeStack, ConstantPool constants, AVM2Instruction ins, MethodInfo[] method_info, List<TreeItem> output, com.jpexs.asdec.abc.types.MethodBody body, com.jpexs.asdec.abc.ABC abc) {
        stack.push(new DecrementTreeItem(ins, (TreeItem) stack.pop()));
    }
}
