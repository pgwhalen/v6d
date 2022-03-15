// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("std::memory_order")
@FFIGen
@CXXHead(
        system = "atomic"
)
public interface memory_order extends CXXPointer {
    @FFIExpr("(*{0})")
    memory_order get();

    @FFIExpr("*{0} = (std::memory_order){1}")
    void set(memory_order __value);

    static memory_order cast(final long __foreign_address) {
        try {
            Class<memory_order> clz = (Class<memory_order>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(memory_order.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static memory_order cast(final FFIPointer __foreign_pointer) {
        return memory_order.cast(__foreign_pointer.getAddress());
    }
}