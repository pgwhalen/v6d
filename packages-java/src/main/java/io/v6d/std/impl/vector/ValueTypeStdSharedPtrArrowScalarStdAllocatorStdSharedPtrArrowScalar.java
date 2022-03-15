// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std.impl.vector;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.Scalar;
import io.v6d.std.impl.shared_ptr.ElementTypeArrowScalar;
import io.v6d.std.shared_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("std::vector<std::shared_ptr<arrow::Scalar>, std::allocator<std::shared_ptr<arrow::Scalar>>>::value_type")
@FFIGen
@CXXHead(
        system = "vector"
)
public interface ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar extends CXXPointer {
    @FFIExpr("{0}")
    shared_ptr<Scalar> get();

    void swap(@CXXReference @FFITypeAlias("std::shared_ptr<arrow::Scalar>") shared_ptr<Scalar> __r);

    void reset();

    @FFINameAlias("get")
    ElementTypeArrowScalar get_1();

    long use_count();

    boolean unique();

    boolean __owner_equivalent(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Scalar>") shared_ptr<Scalar> __p);

    static ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar cast(
            final long __foreign_address) {
        try {
            Class<ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar> clz = (Class<ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar cast(
            final FFIPointer __foreign_pointer) {
        return ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar.class, true));
    }

    static ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar create() {
        return ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar.getFactory().create();
    }

    static ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Scalar>") shared_ptr<Scalar> __r) {
        return ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar.getFactory().create(__r);
    }

    @FFIFactory
    @CXXHead(
            system = "vector"
    )
    interface Factory {
        ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar create();

        ValueTypeStdSharedPtrArrowScalarStdAllocatorStdSharedPtrArrowScalar create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Scalar>") shared_ptr<Scalar> __r);
    }
}