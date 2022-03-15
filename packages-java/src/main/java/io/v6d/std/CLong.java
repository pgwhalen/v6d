// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
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

@FFITypeAlias("long")
@FFIGen
@CXXHead(
        system = "cstdint"
)
public interface CLong extends CXXPointer {
    @FFIExpr("*{0}")
    long get();

    @FFIExpr("*{0} = (long){1}")
    void set(long value);

    static CLong cast(final long __foreign_address) {
        try {
            Class<CLong> clz = (Class<CLong>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(CLong.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static CLong cast(final FFIPointer __foreign_pointer) {
        return CLong.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(CLong.class, true));
    }

    static CLong create() {
        return CLong.getFactory().create();
    }

    @FFIFactory
    interface Factory {
        CLong create();
    }
}