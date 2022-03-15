// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.MutableBuffer;
import io.v6d.std.CChar;
import io.v6d.std.shared_ptr;
import io.v6d.std.string;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::BlobWriter")
@FFIGen
@CXXHead("client/ds/blob.h")
public interface BlobWriter extends ObjectBuilder, FFIPointer {
    long id();

    long size();

    CChar data();

    @FFINameAlias("data")
    CChar data_1();

    @CXXReference
    @FFITypeAlias("const std::shared_ptr<arrow::MutableBuffer>")
    shared_ptr<MutableBuffer> Buffer();

    @CXXValue
    Status Build(@CXXReference Client client);

    @CXXValue
    Status Abort(@CXXReference Client client);

    void AddKeyValue(@CXXReference string key, @CXXReference string value);

    void Dump();

    static BlobWriter cast(final long __foreign_address) {
        try {
            Class<BlobWriter> clz = (Class<BlobWriter>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(BlobWriter.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static BlobWriter cast(final FFIPointer __foreign_pointer) {
        return BlobWriter.cast(__foreign_pointer.getAddress());
    }
}