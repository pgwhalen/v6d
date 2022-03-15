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

@FFIGen
@FFITypeAlias("double")
@CXXHead(
        system = "cstdint"
)
public interface CDouble extends CXXPointer {
    @FFIExpr("*{0}")
    double get();

    @FFIExpr("*{0} = (double){1}")
    void set(double value);

    static CDouble cast(final long __foreign_address) {
        try {
            Class<CDouble> clz = (Class<CDouble>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(CDouble.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static CDouble cast(final FFIPointer __foreign_pointer) {
        return CDouble.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(CDouble.class, true));
    }

    static CDouble create() {
        return CDouble.getFactory().create();
    }

    @FFIFactory
    interface Factory {
        CDouble create();
    }
}