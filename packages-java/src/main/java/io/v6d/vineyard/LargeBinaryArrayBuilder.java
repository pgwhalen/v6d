// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.LargeBinaryArray;
import io.v6d.std.shared_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::LargeBinaryArrayBuilder")
@FFIGen
@CXXHead("basic/ds/arrow.h")
public interface LargeBinaryArrayBuilder extends CXXPointer {
    @FFIExpr("{0}")
    BaseBinaryArrayBuilder<LargeBinaryArray> get();

    @CXXValue
    @FFITypeAlias("std::shared_ptr<arrow::LargeBinaryArray>")
    shared_ptr<LargeBinaryArray> GetArray();

    @CXXValue
    Status Build(@CXXReference Client client);

    static LargeBinaryArrayBuilder cast(final long __foreign_address) {
        try {
            Class<LargeBinaryArrayBuilder> clz = (Class<LargeBinaryArrayBuilder>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(LargeBinaryArrayBuilder.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static LargeBinaryArrayBuilder cast(final FFIPointer __foreign_pointer) {
        return LargeBinaryArrayBuilder.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(LargeBinaryArrayBuilder.class, true));
    }

    static LargeBinaryArrayBuilder create(@CXXReference Client client,
            @CXXValue @FFITypeAlias("std::shared_ptr<arrow::LargeBinaryArray>") shared_ptr<LargeBinaryArray> array) {
        return LargeBinaryArrayBuilder.getFactory().create(client, array);
    }

    @FFIFactory
    @CXXHead("basic/ds/arrow.h")
    interface Factory {
        LargeBinaryArrayBuilder create(@CXXReference Client client,
                @CXXValue @FFITypeAlias("std::shared_ptr<arrow::LargeBinaryArray>") shared_ptr<LargeBinaryArray> array);
    }
}