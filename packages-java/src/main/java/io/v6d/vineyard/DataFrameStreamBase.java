// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.std.CUnsignedLongLong;
import io.v6d.std.shared_ptr;
import io.v6d.std.unique_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::DataFrameStreamBase")
@FFIGen
@CXXHead("basic/ds/dataframe.vineyard.h")
public interface DataFrameStreamBase extends CXXPointer {
    @FFIExpr("{0}")
    Stream<DataFrame> get();

    @CXXValue
    Status Next(
            @CXXReference @FFITypeAlias("std::shared_ptr<vineyard::DataFrame>") shared_ptr<DataFrame> chunk);

    @CXXValue
    Status Push(
            @CXXReference @FFITypeAlias("const std::shared_ptr<vineyard::DataFrame>") shared_ptr<DataFrame> chunk);

    @CXXValue
    @FFINameAlias("Push")
    Status Push_1(
            @CXXReference @FFITypeAlias("const std::shared_ptr<vineyard::Object>") shared_ptr<Object> chunk);

    @CXXValue
    Status Push(@CXXReference ObjectMeta chunk);

    @CXXValue
    Status Push(@CXXReference CUnsignedLongLong chunk);

    @CXXValue
    Status Abort();

    @CXXValue
    Status Finish();

    void Construct(@CXXReference ObjectMeta meta);

    @CXXValue
    Status OpenReader(Client client);

    @CXXValue
    Status OpenWriter(Client client);

    static DataFrameStreamBase cast(final long __foreign_address) {
        try {
            Class<DataFrameStreamBase> clz = (Class<DataFrameStreamBase>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(DataFrameStreamBase.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static DataFrameStreamBase cast(final FFIPointer __foreign_pointer) {
        return DataFrameStreamBase.cast(__foreign_pointer.getAddress());
    }

    @FFIGen
    @FFILibrary(
            value = "vineyard::Stream<vineyard::DataFrame>",
            namespace = "vineyard::Stream<vineyard::DataFrame>"
    )
    @CXXHead("basic/ds/dataframe.vineyard.h")
    interface Library {
        Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

        @CXXValue
        @FFITypeAlias("std::unique_ptr<vineyard::Object>")
        unique_ptr<Object> Create();
    }
}