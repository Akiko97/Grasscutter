// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttackResultCreateCount.proto

package emu.grasscutter.net.proto;

public final class AttackResultCreateCountOuterClass {
  private AttackResultCreateCountOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AttackResultCreateCountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttackResultCreateCount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @return A list containing the unk3250PFFFFJBPKGN.
     */
    java.util.List<java.lang.Integer> getUnk3250PFFFFJBPKGNList();
    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @return The count of unk3250PFFFFJBPKGN.
     */
    int getUnk3250PFFFFJBPKGNCount();
    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3250PFFFFJBPKGN at the given index.
     */
    int getUnk3250PFFFFJBPKGN(int index);

    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @return A list containing the unk3250MDGFBFBAHPB.
     */
    java.util.List<java.lang.Integer> getUnk3250MDGFBFBAHPBList();
    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @return The count of unk3250MDGFBFBAHPB.
     */
    int getUnk3250MDGFBFBAHPBCount();
    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3250MDGFBFBAHPB at the given index.
     */
    int getUnk3250MDGFBFBAHPB(int index);
  }
  /**
   * Protobuf type {@code AttackResultCreateCount}
   */
  public static final class AttackResultCreateCount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AttackResultCreateCount)
      AttackResultCreateCountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AttackResultCreateCount.newBuilder() to construct.
    private AttackResultCreateCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AttackResultCreateCount() {
      unk3250PFFFFJBPKGN_ = emptyIntList();
      unk3250MDGFBFBAHPB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AttackResultCreateCount();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttackResultCreateCount(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3250PFFFFJBPKGN_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3250PFFFFJBPKGN_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3250PFFFFJBPKGN_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3250PFFFFJBPKGN_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                unk3250MDGFBFBAHPB_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              unk3250MDGFBFBAHPB_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                unk3250MDGFBFBAHPB_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3250MDGFBFBAHPB_.addInt(input.readUInt32());
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
          unk3250PFFFFJBPKGN_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          unk3250MDGFBFBAHPB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.internal_static_AttackResultCreateCount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.internal_static_AttackResultCreateCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.class, emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.Builder.class);
    }

    public static final int UNK3250_PFFFFJBPKGN_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unk3250PFFFFJBPKGN_;
    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @return A list containing the unk3250PFFFFJBPKGN.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250PFFFFJBPKGNList() {
      return unk3250PFFFFJBPKGN_;
    }
    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @return The count of unk3250PFFFFJBPKGN.
     */
    public int getUnk3250PFFFFJBPKGNCount() {
      return unk3250PFFFFJBPKGN_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3250PFFFFJBPKGN at the given index.
     */
    public int getUnk3250PFFFFJBPKGN(int index) {
      return unk3250PFFFFJBPKGN_.getInt(index);
    }
    private int unk3250PFFFFJBPKGNMemoizedSerializedSize = -1;

    public static final int UNK3250_MDGFBFBAHPB_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList unk3250MDGFBFBAHPB_;
    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @return A list containing the unk3250MDGFBFBAHPB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250MDGFBFBAHPBList() {
      return unk3250MDGFBFBAHPB_;
    }
    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @return The count of unk3250MDGFBFBAHPB.
     */
    public int getUnk3250MDGFBFBAHPBCount() {
      return unk3250MDGFBFBAHPB_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3250MDGFBFBAHPB at the given index.
     */
    public int getUnk3250MDGFBFBAHPB(int index) {
      return unk3250MDGFBFBAHPB_.getInt(index);
    }
    private int unk3250MDGFBFBAHPBMemoizedSerializedSize = -1;

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
      if (getUnk3250PFFFFJBPKGNList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unk3250PFFFFJBPKGNMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250PFFFFJBPKGN_.size(); i++) {
        output.writeUInt32NoTag(unk3250PFFFFJBPKGN_.getInt(i));
      }
      if (getUnk3250MDGFBFBAHPBList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3250MDGFBFBAHPBMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250MDGFBFBAHPB_.size(); i++) {
        output.writeUInt32NoTag(unk3250MDGFBFBAHPB_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < unk3250PFFFFJBPKGN_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250PFFFFJBPKGN_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250PFFFFJBPKGNList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250PFFFFJBPKGNMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3250MDGFBFBAHPB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250MDGFBFBAHPB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250MDGFBFBAHPBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250MDGFBFBAHPBMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount other = (emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount) obj;

      if (!getUnk3250PFFFFJBPKGNList()
          .equals(other.getUnk3250PFFFFJBPKGNList())) return false;
      if (!getUnk3250MDGFBFBAHPBList()
          .equals(other.getUnk3250MDGFBFBAHPBList())) return false;
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
      if (getUnk3250PFFFFJBPKGNCount() > 0) {
        hash = (37 * hash) + UNK3250_PFFFFJBPKGN_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250PFFFFJBPKGNList().hashCode();
      }
      if (getUnk3250MDGFBFBAHPBCount() > 0) {
        hash = (37 * hash) + UNK3250_MDGFBFBAHPB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250MDGFBFBAHPBList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount prototype) {
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
     * Protobuf type {@code AttackResultCreateCount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttackResultCreateCount)
        emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.internal_static_AttackResultCreateCount_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.internal_static_AttackResultCreateCount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.class, emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.newBuilder()
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
        unk3250PFFFFJBPKGN_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3250MDGFBFBAHPB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.internal_static_AttackResultCreateCount_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount build() {
        emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount buildPartial() {
        emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount result = new emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250PFFFFJBPKGN_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250PFFFFJBPKGN_ = unk3250PFFFFJBPKGN_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3250MDGFBFBAHPB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3250MDGFBFBAHPB_ = unk3250MDGFBFBAHPB_;
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
        if (other instanceof emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount) {
          return mergeFrom((emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount other) {
        if (other == emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount.getDefaultInstance()) return this;
        if (!other.unk3250PFFFFJBPKGN_.isEmpty()) {
          if (unk3250PFFFFJBPKGN_.isEmpty()) {
            unk3250PFFFFJBPKGN_ = other.unk3250PFFFFJBPKGN_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250PFFFFJBPKGNIsMutable();
            unk3250PFFFFJBPKGN_.addAll(other.unk3250PFFFFJBPKGN_);
          }
          onChanged();
        }
        if (!other.unk3250MDGFBFBAHPB_.isEmpty()) {
          if (unk3250MDGFBFBAHPB_.isEmpty()) {
            unk3250MDGFBFBAHPB_ = other.unk3250MDGFBFBAHPB_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3250MDGFBFBAHPBIsMutable();
            unk3250MDGFBFBAHPB_.addAll(other.unk3250MDGFBFBAHPB_);
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
        emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3250PFFFFJBPKGN_ = emptyIntList();
      private void ensureUnk3250PFFFFJBPKGNIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250PFFFFJBPKGN_ = mutableCopy(unk3250PFFFFJBPKGN_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @return A list containing the unk3250PFFFFJBPKGN.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250PFFFFJBPKGNList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250PFFFFJBPKGN_) : unk3250PFFFFJBPKGN_;
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @return The count of unk3250PFFFFJBPKGN.
       */
      public int getUnk3250PFFFFJBPKGNCount() {
        return unk3250PFFFFJBPKGN_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @param index The index of the element to return.
       * @return The unk3250PFFFFJBPKGN at the given index.
       */
      public int getUnk3250PFFFFJBPKGN(int index) {
        return unk3250PFFFFJBPKGN_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @param index The index to set the value at.
       * @param value The unk3250PFFFFJBPKGN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PFFFFJBPKGN(
          int index, int value) {
        ensureUnk3250PFFFFJBPKGNIsMutable();
        unk3250PFFFFJBPKGN_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @param value The unk3250PFFFFJBPKGN to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250PFFFFJBPKGN(int value) {
        ensureUnk3250PFFFFJBPKGNIsMutable();
        unk3250PFFFFJBPKGN_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @param values The unk3250PFFFFJBPKGN to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250PFFFFJBPKGN(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250PFFFFJBPKGNIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250PFFFFJBPKGN_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_PFFFFJBPKGN = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PFFFFJBPKGN() {
        unk3250PFFFFJBPKGN_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3250MDGFBFBAHPB_ = emptyIntList();
      private void ensureUnk3250MDGFBFBAHPBIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3250MDGFBFBAHPB_ = mutableCopy(unk3250MDGFBFBAHPB_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @return A list containing the unk3250MDGFBFBAHPB.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250MDGFBFBAHPBList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250MDGFBFBAHPB_) : unk3250MDGFBFBAHPB_;
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @return The count of unk3250MDGFBFBAHPB.
       */
      public int getUnk3250MDGFBFBAHPBCount() {
        return unk3250MDGFBFBAHPB_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3250MDGFBFBAHPB at the given index.
       */
      public int getUnk3250MDGFBFBAHPB(int index) {
        return unk3250MDGFBFBAHPB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3250MDGFBFBAHPB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250MDGFBFBAHPB(
          int index, int value) {
        ensureUnk3250MDGFBFBAHPBIsMutable();
        unk3250MDGFBFBAHPB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @param value The unk3250MDGFBFBAHPB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250MDGFBFBAHPB(int value) {
        ensureUnk3250MDGFBFBAHPBIsMutable();
        unk3250MDGFBFBAHPB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @param values The unk3250MDGFBFBAHPB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250MDGFBFBAHPB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250MDGFBFBAHPBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250MDGFBFBAHPB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_MDGFBFBAHPB = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250MDGFBFBAHPB() {
        unk3250MDGFBFBAHPB_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:AttackResultCreateCount)
    }

    // @@protoc_insertion_point(class_scope:AttackResultCreateCount)
    private static final emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount();
    }

    public static emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AttackResultCreateCount>
        PARSER = new com.google.protobuf.AbstractParser<AttackResultCreateCount>() {
      @java.lang.Override
      public AttackResultCreateCount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttackResultCreateCount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AttackResultCreateCount> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AttackResultCreateCount> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AttackResultCreateCountOuterClass.AttackResultCreateCount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttackResultCreateCount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttackResultCreateCount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AttackResultCreateCount.proto\"S\n\027Attac" +
      "kResultCreateCount\022\033\n\023Unk3250_PFFFFJBPKG" +
      "N\030\010 \003(\r\022\033\n\023Unk3250_MDGFBFBAHPB\030\n \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AttackResultCreateCount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttackResultCreateCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttackResultCreateCount_descriptor,
        new java.lang.String[] { "Unk3250PFFFFJBPKGN", "Unk3250MDGFBFBAHPB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}