// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LMDOHGLNABL.proto

package emu.grasscutter.net.proto;

public final class Unk3150LMDOHGLNABL {
  private Unk3150LMDOHGLNABL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LMDOHGLNABLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LMDOHGLNABL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @return A list containing the unk3150KJJJNCGGOMG.
     */
    java.util.List<java.lang.Integer> getUnk3150KJJJNCGGOMGList();
    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @return The count of unk3150KJJJNCGGOMG.
     */
    int getUnk3150KJJJNCGGOMGCount();
    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3150KJJJNCGGOMG at the given index.
     */
    int getUnk3150KJJJNCGGOMG(int index);

    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 21392
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_LMDOHGLNABL}
   */
  public static final class Unk3150_LMDOHGLNABL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LMDOHGLNABL)
      Unk3150_LMDOHGLNABLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LMDOHGLNABL.newBuilder() to construct.
    private Unk3150_LMDOHGLNABL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LMDOHGLNABL() {
      unk3150KJJJNCGGOMG_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LMDOHGLNABL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_LMDOHGLNABL(
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
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3150KJJJNCGGOMG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3150KJJJNCGGOMG_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3150KJJJNCGGOMG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3150KJJJNCGGOMG_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              dungeonId_ = input.readUInt32();
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
          unk3150KJJJNCGGOMG_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.internal_static_Unk3150_LMDOHGLNABL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.internal_static_Unk3150_LMDOHGLNABL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.class, emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.Builder.class);
    }

    public static final int UNK3150_KJJJNCGGOMG_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList unk3150KJJJNCGGOMG_;
    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @return A list containing the unk3150KJJJNCGGOMG.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150KJJJNCGGOMGList() {
      return unk3150KJJJNCGGOMG_;
    }
    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @return The count of unk3150KJJJNCGGOMG.
     */
    public int getUnk3150KJJJNCGGOMGCount() {
      return unk3150KJJJNCGGOMG_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3150KJJJNCGGOMG at the given index.
     */
    public int getUnk3150KJJJNCGGOMG(int index) {
      return unk3150KJJJNCGGOMG_.getInt(index);
    }
    private int unk3150KJJJNCGGOMGMemoizedSerializedSize = -1;

    public static final int DUNGEON_ID_FIELD_NUMBER = 12;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

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
      if (getUnk3150KJJJNCGGOMGList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(unk3150KJJJNCGGOMGMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150KJJJNCGGOMG_.size(); i++) {
        output.writeUInt32NoTag(unk3150KJJJNCGGOMG_.getInt(i));
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
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
        for (int i = 0; i < unk3150KJJJNCGGOMG_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150KJJJNCGGOMG_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150KJJJNCGGOMGList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150KJJJNCGGOMGMemoizedSerializedSize = dataSize;
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL other = (emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL) obj;

      if (!getUnk3150KJJJNCGGOMGList()
          .equals(other.getUnk3150KJJJNCGGOMGList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      if (getUnk3150KJJJNCGGOMGCount() > 0) {
        hash = (37 * hash) + UNK3150_KJJJNCGGOMG_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150KJJJNCGGOMGList().hashCode();
      }
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL prototype) {
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
     * <pre>
     * CmdId: 21392
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_LMDOHGLNABL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LMDOHGLNABL)
        emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.internal_static_Unk3150_LMDOHGLNABL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.internal_static_Unk3150_LMDOHGLNABL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.class, emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.newBuilder()
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
        unk3150KJJJNCGGOMG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.internal_static_Unk3150_LMDOHGLNABL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL build() {
        emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL buildPartial() {
        emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL result = new emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150KJJJNCGGOMG_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150KJJJNCGGOMG_ = unk3150KJJJNCGGOMG_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL other) {
        if (other == emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL.getDefaultInstance()) return this;
        if (!other.unk3150KJJJNCGGOMG_.isEmpty()) {
          if (unk3150KJJJNCGGOMG_.isEmpty()) {
            unk3150KJJJNCGGOMG_ = other.unk3150KJJJNCGGOMG_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150KJJJNCGGOMGIsMutable();
            unk3150KJJJNCGGOMG_.addAll(other.unk3150KJJJNCGGOMG_);
          }
          onChanged();
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3150KJJJNCGGOMG_ = emptyIntList();
      private void ensureUnk3150KJJJNCGGOMGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150KJJJNCGGOMG_ = mutableCopy(unk3150KJJJNCGGOMG_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @return A list containing the unk3150KJJJNCGGOMG.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150KJJJNCGGOMGList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150KJJJNCGGOMG_) : unk3150KJJJNCGGOMG_;
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @return The count of unk3150KJJJNCGGOMG.
       */
      public int getUnk3150KJJJNCGGOMGCount() {
        return unk3150KJJJNCGGOMG_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @param index The index of the element to return.
       * @return The unk3150KJJJNCGGOMG at the given index.
       */
      public int getUnk3150KJJJNCGGOMG(int index) {
        return unk3150KJJJNCGGOMG_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @param index The index to set the value at.
       * @param value The unk3150KJJJNCGGOMG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150KJJJNCGGOMG(
          int index, int value) {
        ensureUnk3150KJJJNCGGOMGIsMutable();
        unk3150KJJJNCGGOMG_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @param value The unk3150KJJJNCGGOMG to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150KJJJNCGGOMG(int value) {
        ensureUnk3150KJJJNCGGOMGIsMutable();
        unk3150KJJJNCGGOMG_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @param values The unk3150KJJJNCGGOMG to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150KJJJNCGGOMG(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150KJJJNCGGOMGIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150KJJJNCGGOMG_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_KJJJNCGGOMG = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150KJJJNCGGOMG() {
        unk3150KJJJNCGGOMG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LMDOHGLNABL)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LMDOHGLNABL)
    private static final emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL();
    }

    public static emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LMDOHGLNABL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LMDOHGLNABL>() {
      @java.lang.Override
      public Unk3150_LMDOHGLNABL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_LMDOHGLNABL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_LMDOHGLNABL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LMDOHGLNABL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150LMDOHGLNABL.Unk3150_LMDOHGLNABL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LMDOHGLNABL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LMDOHGLNABL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LMDOHGLNABL.proto\"F\n\023Unk3150_L" +
      "MDOHGLNABL\022\033\n\023Unk3150_KJJJNCGGOMG\030\006 \003(\r\022" +
      "\022\n\ndungeon_id\030\014 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LMDOHGLNABL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LMDOHGLNABL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LMDOHGLNABL_descriptor,
        new java.lang.String[] { "Unk3150KJJJNCGGOMG", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}