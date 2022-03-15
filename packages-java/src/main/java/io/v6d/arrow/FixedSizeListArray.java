// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.arrow;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
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

@FFITypeAlias("arrow::FixedSizeListArray")
@FFIGen
@CXXHead(
        system = "arrow/array/array_nested.h"
)
public interface FixedSizeListArray extends Array, FFIPointer {
    FixedSizeListType list_type();

    @CXXValue
    @FFITypeAlias("std::shared_ptr<arrow::Array>")
    shared_ptr<Array> values();

    @CXXValue
    @FFITypeAlias("std::shared_ptr<arrow::DataType>")
    shared_ptr<DataType> value_type();

    int value_offset(long i);

    int value_length(long i);

    @CXXValue
    @FFITypeAlias("std::shared_ptr<arrow::Array>")
    shared_ptr<Array> value_slice(long i);

    @CXXValue
    @FFITypeAlias("arrow::Result<std::shared_ptr<arrow::Array>>")
    Result<shared_ptr<Array>> Flatten(MemoryPool memory_pool);

    static FixedSizeListArray cast(final long __foreign_address) {
        try {
            Class<FixedSizeListArray> clz = (Class<FixedSizeListArray>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(FixedSizeListArray.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static FixedSizeListArray cast(final FFIPointer __foreign_pointer) {
        return FixedSizeListArray.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(FixedSizeListArray.class, true));
    }

    static FixedSizeListArray create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data) {
        return FixedSizeListArray.getFactory().create(data);
    }

    static FixedSizeListArray create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> type,
            long length,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Array>") shared_ptr<Array> values,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
            long null_count, long offset) {
        return FixedSizeListArray.getFactory().create(type, length, values, null_bitmap, null_count, offset);
    }

    @FFIFactory
    @CXXHead(
            system = "arrow/array/array_nested.h"
    )
    interface Factory {
        FixedSizeListArray create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data);

        FixedSizeListArray create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> type,
                long length,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Array>") shared_ptr<Array> values,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
                long null_count, long offset);
    }

    @FFIGen
    @FFILibrary(
            value = "arrow::FixedSizeListArray",
            namespace = "arrow::FixedSizeListArray"
    )
    @CXXHead(
            system = "arrow/array/array_nested.h"
    )
    interface Library {
        Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

        @CXXValue
        @FFITypeAlias("arrow::Result<std::shared_ptr<arrow::Array>>")
        Result<shared_ptr<Array>> FromArrays(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Array>") shared_ptr<Array> values,
                int list_size);
    }

    @FFITypeAlias("arrow::FixedSizeListArray::TypeClass")
    @FFIGen
    @CXXHead(
            system = "arrow/array/array_nested.h"
    )
    interface TypeClass extends CXXPointer {
        @FFIExpr("{0}")
        FixedSizeListType get();

        @CXXValue
        DataTypeLayout layout();

        @CXXValue
        string ToString();

        @CXXValue
        string name();

        int list_size();

        static TypeClass cast(final long __foreign_address) {
            try {
                Class<TypeClass> clz = (Class<TypeClass>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(TypeClass.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static TypeClass cast(final FFIPointer __foreign_pointer) {
            return TypeClass.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(TypeClass.class, true));
        }

        static TypeClass create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> value_type,
                int list_size) {
            return TypeClass.getFactory().create(value_type, list_size);
        }

        @FFIFactory
        @CXXHead(
                system = "arrow/array/array_nested.h"
        )
        interface Factory {
            TypeClass create(
                    @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> value_type,
                    int list_size);
        }

        @FFIGen
        @FFILibrary(
                value = "arrow::FixedSizeListType",
                namespace = "arrow::FixedSizeListType"
        )
        @CXXHead(
                system = "arrow/array/array_nested.h"
        )
        interface Library {
            Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

            CChar type_name();
        }
    }

    @FFITypeAlias("arrow::FixedSizeListArray::offset_type")
    @FFIGen
    @CXXHead(
            system = "arrow/array/array_nested.h"
    )
    interface offset_type extends CXXPointer {
        @FFIExpr("{0}")
        FixedSizeListType.offset_type get();

        static offset_type cast(final long __foreign_address) {
            try {
                Class<offset_type> clz = (Class<offset_type>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(offset_type.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static offset_type cast(final FFIPointer __foreign_pointer) {
            return offset_type.cast(__foreign_pointer.getAddress());
        }
    }
}