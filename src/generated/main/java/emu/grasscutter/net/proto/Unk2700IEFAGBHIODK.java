// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_IEFAGBHIODK.proto

package emu.grasscutter.net.proto;

public final class Unk2700IEFAGBHIODK {
  private Unk2700IEFAGBHIODK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_IEFAGBHIODKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_IEFAGBHIODK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @return A list containing the unk2700CPOJCHEOPLB.
     */
    java.util.List<java.lang.Integer> getUnk2700CPOJCHEOPLBList();
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @return The count of unk2700CPOJCHEOPLB.
     */
    int getUnk2700CPOJCHEOPLBCount();
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @param index The index of the element to return.
     * @return The unk2700CPOJCHEOPLB at the given index.
     */
    int getUnk2700CPOJCHEOPLB(int index);

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();

    /**
     * <code>uint32 Unk3250_IDEEPEOPCIL = 1;</code>
     * @return The unk3250IDEEPEOPCIL.
     */
    int getUnk3250IDEEPEOPCIL();
  }
  /**
   * <pre>
   * CmdId: 8169
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_IEFAGBHIODK}
   */
  public static final class Unk2700_IEFAGBHIODK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_IEFAGBHIODK)
      Unk2700_IEFAGBHIODKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_IEFAGBHIODK.newBuilder() to construct.
    private Unk2700_IEFAGBHIODK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_IEFAGBHIODK() {
      unk2700CPOJCHEOPLB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_IEFAGBHIODK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_IEFAGBHIODK(
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

              unk3250IDEEPEOPCIL_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700CPOJCHEOPLB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700CPOJCHEOPLB_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700CPOJCHEOPLB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700CPOJCHEOPLB_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              unk3250PPIHJFNMEFB_ = input.readUInt32();
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
          unk2700CPOJCHEOPLB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.class, emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.Builder.class);
    }

    public static final int UNK2700_CPOJCHEOPLB_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList unk2700CPOJCHEOPLB_;
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @return A list containing the unk2700CPOJCHEOPLB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700CPOJCHEOPLBList() {
      return unk2700CPOJCHEOPLB_;
    }
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @return The count of unk2700CPOJCHEOPLB.
     */
    public int getUnk2700CPOJCHEOPLBCount() {
      return unk2700CPOJCHEOPLB_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
     * @param index The index of the element to return.
     * @return The unk2700CPOJCHEOPLB at the given index.
     */
    public int getUnk2700CPOJCHEOPLB(int index) {
      return unk2700CPOJCHEOPLB_.getInt(index);
    }
    private int unk2700CPOJCHEOPLBMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 12;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
    }

    public static final int UNK3250_IDEEPEOPCIL_FIELD_NUMBER = 1;
    private int unk3250IDEEPEOPCIL_;
    /**
     * <code>uint32 Unk3250_IDEEPEOPCIL = 1;</code>
     * @return The unk3250IDEEPEOPCIL.
     */
    @java.lang.Override
    public int getUnk3250IDEEPEOPCIL() {
      return unk3250IDEEPEOPCIL_;
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
      if (unk3250IDEEPEOPCIL_ != 0) {
        output.writeUInt32(1, unk3250IDEEPEOPCIL_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (getUnk2700CPOJCHEOPLBList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(unk2700CPOJCHEOPLBMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700CPOJCHEOPLB_.size(); i++) {
        output.writeUInt32NoTag(unk2700CPOJCHEOPLB_.getInt(i));
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(12, unk3250PPIHJFNMEFB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250IDEEPEOPCIL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250IDEEPEOPCIL_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700CPOJCHEOPLB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700CPOJCHEOPLB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700CPOJCHEOPLBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700CPOJCHEOPLBMemoizedSerializedSize = dataSize;
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250PPIHJFNMEFB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK other = (emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) obj;

      if (!getUnk2700CPOJCHEOPLBList()
          .equals(other.getUnk2700CPOJCHEOPLBList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
      if (getUnk3250IDEEPEOPCIL()
          != other.getUnk3250IDEEPEOPCIL()) return false;
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
      if (getUnk2700CPOJCHEOPLBCount() > 0) {
        hash = (37 * hash) + UNK2700_CPOJCHEOPLB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700CPOJCHEOPLBList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (37 * hash) + UNK3250_IDEEPEOPCIL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IDEEPEOPCIL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK prototype) {
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
     * CmdId: 8169
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_IEFAGBHIODK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_IEFAGBHIODK)
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.class, emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.newBuilder()
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
        unk2700CPOJCHEOPLB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        unk3250PPIHJFNMEFB_ = 0;

        unk3250IDEEPEOPCIL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK build() {
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK buildPartial() {
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK result = new emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700CPOJCHEOPLB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700CPOJCHEOPLB_ = unk2700CPOJCHEOPLB_;
        result.retcode_ = retcode_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
        result.unk3250IDEEPEOPCIL_ = unk3250IDEEPEOPCIL_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK other) {
        if (other == emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.getDefaultInstance()) return this;
        if (!other.unk2700CPOJCHEOPLB_.isEmpty()) {
          if (unk2700CPOJCHEOPLB_.isEmpty()) {
            unk2700CPOJCHEOPLB_ = other.unk2700CPOJCHEOPLB_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700CPOJCHEOPLBIsMutable();
            unk2700CPOJCHEOPLB_.addAll(other.unk2700CPOJCHEOPLB_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
        }
        if (other.getUnk3250IDEEPEOPCIL() != 0) {
          setUnk3250IDEEPEOPCIL(other.getUnk3250IDEEPEOPCIL());
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
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk2700CPOJCHEOPLB_ = emptyIntList();
      private void ensureUnk2700CPOJCHEOPLBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700CPOJCHEOPLB_ = mutableCopy(unk2700CPOJCHEOPLB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @return A list containing the unk2700CPOJCHEOPLB.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700CPOJCHEOPLBList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700CPOJCHEOPLB_) : unk2700CPOJCHEOPLB_;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @return The count of unk2700CPOJCHEOPLB.
       */
      public int getUnk2700CPOJCHEOPLBCount() {
        return unk2700CPOJCHEOPLB_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @param index The index of the element to return.
       * @return The unk2700CPOJCHEOPLB at the given index.
       */
      public int getUnk2700CPOJCHEOPLB(int index) {
        return unk2700CPOJCHEOPLB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @param index The index to set the value at.
       * @param value The unk2700CPOJCHEOPLB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700CPOJCHEOPLB(
          int index, int value) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        unk2700CPOJCHEOPLB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @param value The unk2700CPOJCHEOPLB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700CPOJCHEOPLB(int value) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        unk2700CPOJCHEOPLB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @param values The unk2700CPOJCHEOPLB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700CPOJCHEOPLB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700CPOJCHEOPLB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700CPOJCHEOPLB() {
        unk2700CPOJCHEOPLB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
        onChanged();
        return this;
      }

      private int unk3250IDEEPEOPCIL_ ;
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 1;</code>
       * @return The unk3250IDEEPEOPCIL.
       */
      @java.lang.Override
      public int getUnk3250IDEEPEOPCIL() {
        return unk3250IDEEPEOPCIL_;
      }
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 1;</code>
       * @param value The unk3250IDEEPEOPCIL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IDEEPEOPCIL(int value) {
        
        unk3250IDEEPEOPCIL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IDEEPEOPCIL() {
        
        unk3250IDEEPEOPCIL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_IEFAGBHIODK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_IEFAGBHIODK)
    private static final emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK();
    }

    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_IEFAGBHIODK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_IEFAGBHIODK>() {
      @java.lang.Override
      public Unk2700_IEFAGBHIODK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_IEFAGBHIODK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_IEFAGBHIODK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_IEFAGBHIODK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_IEFAGBHIODK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_IEFAGBHIODK.proto\"}\n\023Unk2700_I" +
      "EFAGBHIODK\022\033\n\023Unk2700_CPOJCHEOPLB\030\013 \003(\r\022" +
      "\017\n\007retcode\030\003 \001(\005\022\033\n\023Unk3250_PPIHJFNMEFB\030" +
      "\014 \001(\r\022\033\n\023Unk3250_IDEEPEOPCIL\030\001 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_IEFAGBHIODK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_IEFAGBHIODK_descriptor,
        new java.lang.String[] { "Unk2700CPOJCHEOPLB", "Retcode", "Unk3250PPIHJFNMEFB", "Unk3250IDEEPEOPCIL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}