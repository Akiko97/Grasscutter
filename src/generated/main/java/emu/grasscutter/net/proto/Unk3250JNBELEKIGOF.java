// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_JNBELEKIGOF.proto

package emu.grasscutter.net.proto;

public final class Unk3250JNBELEKIGOF {
  private Unk3250JNBELEKIGOF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_JNBELEKIGOFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_JNBELEKIGOF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    java.util.List<java.lang.Integer> getUnk3250JDGLLFNGLGIList();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    int getUnk3250JDGLLFNGLGICount();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    int getUnk3250JDGLLFNGLGI(int index);

    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @return A list containing the unk3250GDAOCBFOJGB.
     */
    java.util.List<java.lang.Integer> getUnk3250GDAOCBFOJGBList();
    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @return The count of unk3250GDAOCBFOJGB.
     */
    int getUnk3250GDAOCBFOJGBCount();
    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3250GDAOCBFOJGB at the given index.
     */
    int getUnk3250GDAOCBFOJGB(int index);
  }
  /**
   * Protobuf type {@code Unk3250_JNBELEKIGOF}
   */
  public static final class Unk3250_JNBELEKIGOF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_JNBELEKIGOF)
      Unk3250_JNBELEKIGOFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_JNBELEKIGOF.newBuilder() to construct.
    private Unk3250_JNBELEKIGOF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_JNBELEKIGOF() {
      unk3250JDGLLFNGLGI_ = emptyIntList();
      unk3250GDAOCBFOJGB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_JNBELEKIGOF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3250_JNBELEKIGOF(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              uid_ = input.readUInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3250JDGLLFNGLGI_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3250JDGLLFNGLGI_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3250JDGLLFNGLGI_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3250JDGLLFNGLGI_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                unk3250GDAOCBFOJGB_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              unk3250GDAOCBFOJGB_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                unk3250GDAOCBFOJGB_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3250GDAOCBFOJGB_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          unk3250GDAOCBFOJGB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.internal_static_Unk3250_JNBELEKIGOF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.internal_static_Unk3250_JNBELEKIGOF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.class, emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int UNK3250_JDGLLFNGLGI_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_;
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250JDGLLFNGLGIList() {
      return unk3250JDGLLFNGLGI_;
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    public int getUnk3250JDGLLFNGLGICount() {
      return unk3250JDGLLFNGLGI_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    public int getUnk3250JDGLLFNGLGI(int index) {
      return unk3250JDGLLFNGLGI_.getInt(index);
    }
    private int unk3250JDGLLFNGLGIMemoizedSerializedSize = -1;

    public static final int UNK3250_GDAOCBFOJGB_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList unk3250GDAOCBFOJGB_;
    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @return A list containing the unk3250GDAOCBFOJGB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250GDAOCBFOJGBList() {
      return unk3250GDAOCBFOJGB_;
    }
    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @return The count of unk3250GDAOCBFOJGB.
     */
    public int getUnk3250GDAOCBFOJGBCount() {
      return unk3250GDAOCBFOJGB_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3250GDAOCBFOJGB at the given index.
     */
    public int getUnk3250GDAOCBFOJGB(int index) {
      return unk3250GDAOCBFOJGB_.getInt(index);
    }
    private int unk3250GDAOCBFOJGBMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (uid_ != 0) {
        output.writeUInt32(1, uid_);
      }
      if (getUnk3250JDGLLFNGLGIList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(unk3250JDGLLFNGLGIMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
        output.writeUInt32NoTag(unk3250JDGLLFNGLGI_.getInt(i));
      }
      if (getUnk3250GDAOCBFOJGBList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(unk3250GDAOCBFOJGBMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250GDAOCBFOJGB_.size(); i++) {
        output.writeUInt32NoTag(unk3250GDAOCBFOJGB_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250JDGLLFNGLGI_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250JDGLLFNGLGIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250JDGLLFNGLGIMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3250GDAOCBFOJGB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250GDAOCBFOJGB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250GDAOCBFOJGBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250GDAOCBFOJGBMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF other = (emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getUnk3250JDGLLFNGLGIList()
          .equals(other.getUnk3250JDGLLFNGLGIList())) return false;
      if (!getUnk3250GDAOCBFOJGBList()
          .equals(other.getUnk3250GDAOCBFOJGBList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getUnk3250JDGLLFNGLGICount() > 0) {
        hash = (37 * hash) + UNK3250_JDGLLFNGLGI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250JDGLLFNGLGIList().hashCode();
      }
      if (getUnk3250GDAOCBFOJGBCount() > 0) {
        hash = (37 * hash) + UNK3250_GDAOCBFOJGB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250GDAOCBFOJGBList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Unk3250_JNBELEKIGOF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_JNBELEKIGOF)
        emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.internal_static_Unk3250_JNBELEKIGOF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.internal_static_Unk3250_JNBELEKIGOF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.class, emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3250GDAOCBFOJGB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.internal_static_Unk3250_JNBELEKIGOF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF build() {
        emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF buildPartial() {
        emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF result = new emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250JDGLLFNGLGI_ = unk3250JDGLLFNGLGI_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3250GDAOCBFOJGB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3250GDAOCBFOJGB_ = unk3250GDAOCBFOJGB_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF other) {
        if (other == emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.unk3250JDGLLFNGLGI_.isEmpty()) {
          if (unk3250JDGLLFNGLGI_.isEmpty()) {
            unk3250JDGLLFNGLGI_ = other.unk3250JDGLLFNGLGI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250JDGLLFNGLGIIsMutable();
            unk3250JDGLLFNGLGI_.addAll(other.unk3250JDGLLFNGLGI_);
          }
          onChanged();
        }
        if (!other.unk3250GDAOCBFOJGB_.isEmpty()) {
          if (unk3250GDAOCBFOJGB_.isEmpty()) {
            unk3250GDAOCBFOJGB_ = other.unk3250GDAOCBFOJGB_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3250GDAOCBFOJGBIsMutable();
            unk3250GDAOCBFOJGB_.addAll(other.unk3250GDAOCBFOJGB_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>uint32 uid = 1;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_ = emptyIntList();
      private void ensureUnk3250JDGLLFNGLGIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_ = mutableCopy(unk3250JDGLLFNGLGI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return A list containing the unk3250JDGLLFNGLGI.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250JDGLLFNGLGIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250JDGLLFNGLGI_) : unk3250JDGLLFNGLGI_;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return The count of unk3250JDGLLFNGLGI.
       */
      public int getUnk3250JDGLLFNGLGICount() {
        return unk3250JDGLLFNGLGI_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param index The index of the element to return.
       * @return The unk3250JDGLLFNGLGI at the given index.
       */
      public int getUnk3250JDGLLFNGLGI(int index) {
        return unk3250JDGLLFNGLGI_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param index The index to set the value at.
       * @param value The unk3250JDGLLFNGLGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JDGLLFNGLGI(
          int index, int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param value The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250JDGLLFNGLGI(int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param values The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250JDGLLFNGLGI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250JDGLLFNGLGI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JDGLLFNGLGI() {
        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3250GDAOCBFOJGB_ = emptyIntList();
      private void ensureUnk3250GDAOCBFOJGBIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3250GDAOCBFOJGB_ = mutableCopy(unk3250GDAOCBFOJGB_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @return A list containing the unk3250GDAOCBFOJGB.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250GDAOCBFOJGBList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250GDAOCBFOJGB_) : unk3250GDAOCBFOJGB_;
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @return The count of unk3250GDAOCBFOJGB.
       */
      public int getUnk3250GDAOCBFOJGBCount() {
        return unk3250GDAOCBFOJGB_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @param index The index of the element to return.
       * @return The unk3250GDAOCBFOJGB at the given index.
       */
      public int getUnk3250GDAOCBFOJGB(int index) {
        return unk3250GDAOCBFOJGB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @param index The index to set the value at.
       * @param value The unk3250GDAOCBFOJGB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250GDAOCBFOJGB(
          int index, int value) {
        ensureUnk3250GDAOCBFOJGBIsMutable();
        unk3250GDAOCBFOJGB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @param value The unk3250GDAOCBFOJGB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250GDAOCBFOJGB(int value) {
        ensureUnk3250GDAOCBFOJGBIsMutable();
        unk3250GDAOCBFOJGB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @param values The unk3250GDAOCBFOJGB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250GDAOCBFOJGB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250GDAOCBFOJGBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250GDAOCBFOJGB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_GDAOCBFOJGB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250GDAOCBFOJGB() {
        unk3250GDAOCBFOJGB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Unk3250_JNBELEKIGOF)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_JNBELEKIGOF)
    private static final emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF();
    }

    public static emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_JNBELEKIGOF>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_JNBELEKIGOF>() {
      @java.lang.Override
      public Unk3250_JNBELEKIGOF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3250_JNBELEKIGOF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3250_JNBELEKIGOF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_JNBELEKIGOF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3250JNBELEKIGOF.Unk3250_JNBELEKIGOF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_JNBELEKIGOF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_JNBELEKIGOF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_JNBELEKIGOF.proto\"\\\n\023Unk3250_J" +
      "NBELEKIGOF\022\013\n\003uid\030\001 \001(\r\022\033\n\023Unk3250_JDGLL" +
      "FNGLGI\030\002 \003(\r\022\033\n\023Unk3250_GDAOCBFOJGB\030\003 \003(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_JNBELEKIGOF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_JNBELEKIGOF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_JNBELEKIGOF_descriptor,
        new java.lang.String[] { "Uid", "Unk3250JDGLLFNGLGI", "Unk3250GDAOCBFOJGB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}