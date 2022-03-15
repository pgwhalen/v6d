// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.RecordBatch;
import io.v6d.std.shared_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::RecordBatchBuilder")
@FFIGen
@CXXHead("basic/ds/arrow.h")
public interface RecordBatchBuilder extends RecordBatchBaseBuilder, FFIPointer {
    @CXXValue
    @FFINameAlias("Build")
    Status Build_1(@CXXReference Client client);

    static RecordBatchBuilder cast(final long __foreign_address) {
        try {
            Class<RecordBatchBuilder> clz = (Class<RecordBatchBuilder>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(RecordBatchBuilder.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static RecordBatchBuilder cast(final FFIPointer __foreign_pointer) {
        return RecordBatchBuilder.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(RecordBatchBuilder.class, true));
    }

    static RecordBatchBuilder create(@CXXReference Client client,
            @CXXValue @FFITypeAlias("std::shared_ptr<arrow::RecordBatch>") shared_ptr<RecordBatch> batch) {
        return RecordBatchBuilder.getFactory().create(client, batch);
    }

    @FFIFactory
    @CXXHead("basic/ds/arrow.h")
    interface Factory {
        RecordBatchBuilder create(@CXXReference Client client,
                @CXXValue @FFITypeAlias("std::shared_ptr<arrow::RecordBatch>") shared_ptr<RecordBatch> batch);
    }
}