// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.std.CLongLong;
import io.v6d.std.shared_ptr;
import io.v6d.std.unique_ptr;
import io.v6d.std.vector;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::GlobalTensor")
@FFIGen
@CXXHead("basic/ds/tensor.h")
public interface GlobalTensor extends Registered<GlobalTensor>, GlobalObject, FFIPointer {
    @FFINameAlias("Construct")
    void Construct_1(@CXXReference ObjectMeta meta);

    @CXXReference
    @FFITypeAlias("const std::vector<long long>")
    vector<CLongLong> shape();

    @CXXReference
    @FFITypeAlias("const std::vector<long long>")
    vector<CLongLong> partition_shape();

    @CXXReference
    @FFITypeAlias("const std::vector<std::shared_ptr<vineyard::ITensor>>")
    vector<shared_ptr<ITensor>> LocalPartitions(@CXXReference Client client);

    @CXXReference
    @FFITypeAlias("const std::vector<std::shared_ptr<vineyard::ITensor>>")
    vector<shared_ptr<ITensor>> LocalPartitions(long instance_id);

    static GlobalTensor cast(final long __foreign_address) {
        try {
            Class<GlobalTensor> clz = (Class<GlobalTensor>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(GlobalTensor.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static GlobalTensor cast(final FFIPointer __foreign_pointer) {
        return GlobalTensor.cast(__foreign_pointer.getAddress());
    }

    @FFIGen
    @FFILibrary(
            value = "vineyard::GlobalTensor",
            namespace = "vineyard::GlobalTensor"
    )
    @CXXHead("basic/ds/tensor.h")
    interface Library {
        Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

        @CXXValue
        @FFITypeAlias("std::unique_ptr<vineyard::Object>")
        unique_ptr<Object> Create();
    }
}