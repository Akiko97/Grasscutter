// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_AKIBKKOMBMC.proto

package emu.grasscutter.net.proto;

public final class Unk2700AKIBKKOMBMC {
  private Unk2700AKIBKKOMBMC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_AKIBKKOMBMCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_AKIBKKOMBMC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 3;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> 
        getUnk2700GOCEOKPHFIOList();
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ getUnk2700GOCEOKPHFIO(int index);
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    int getUnk2700GOCEOKPHFIOCount();
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder> 
        getUnk2700GOCEOKPHFIOOrBuilderList();
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder getUnk2700GOCEOKPHFIOOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8424
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_AKIBKKOMBMC}
   */
  public static final class Unk2700_AKIBKKOMBMC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_AKIBKKOMBMC)
      Unk2700_AKIBKKOMBMCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_AKIBKKOMBMC.newBuilder() to construct.
    private Unk2700_AKIBKKOMBMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_AKIBKKOMBMC() {
      unk2700GOCEOKPHFIO_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_AKIBKKOMBMC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_AKIBKKOMBMC(
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
            case 24: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700GOCEOKPHFIO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700GOCEOKPHFIO_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.parser(), extensionRegistry));
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
          unk2700GOCEOKPHFIO_ = java.util.Collections.unmodifiableList(unk2700GOCEOKPHFIO_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.internal_static_Unk2700_AKIBKKOMBMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.internal_static_Unk2700_AKIBKKOMBMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.class, emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 3;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 3;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int UNK2700_GOCEOKPHFIO_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> unk2700GOCEOKPHFIO_;
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> getUnk2700GOCEOKPHFIOList() {
      return unk2700GOCEOKPHFIO_;
    }
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder> 
        getUnk2700GOCEOKPHFIOOrBuilderList() {
      return unk2700GOCEOKPHFIO_;
    }
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    @java.lang.Override
    public int getUnk2700GOCEOKPHFIOCount() {
      return unk2700GOCEOKPHFIO_.size();
    }
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ getUnk2700GOCEOKPHFIO(int index) {
      return unk2700GOCEOKPHFIO_.get(index);
    }
    /**
     * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder getUnk2700GOCEOKPHFIOOrBuilder(
        int index) {
      return unk2700GOCEOKPHFIO_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (scheduleId_ != 0) {
        output.writeUInt32(3, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      for (int i = 0; i < unk2700GOCEOKPHFIO_.size(); i++) {
        output.writeMessage(12, unk2700GOCEOKPHFIO_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      for (int i = 0; i < unk2700GOCEOKPHFIO_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, unk2700GOCEOKPHFIO_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC other = (emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!getUnk2700GOCEOKPHFIOList()
          .equals(other.getUnk2700GOCEOKPHFIOList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (getUnk2700GOCEOKPHFIOCount() > 0) {
        hash = (37 * hash) + UNK2700_GOCEOKPHFIO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700GOCEOKPHFIOList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC prototype) {
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
     * CmdId: 8424
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_AKIBKKOMBMC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_AKIBKKOMBMC)
        emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.internal_static_Unk2700_AKIBKKOMBMC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.internal_static_Unk2700_AKIBKKOMBMC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.class, emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.newBuilder()
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
          getUnk2700GOCEOKPHFIOFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        scheduleId_ = 0;

        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          unk2700GOCEOKPHFIO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700GOCEOKPHFIOBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.internal_static_Unk2700_AKIBKKOMBMC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC build() {
        emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC buildPartial() {
        emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC result = new emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC(this);
        int from_bitField0_ = bitField0_;
        result.scheduleId_ = scheduleId_;
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700GOCEOKPHFIO_ = java.util.Collections.unmodifiableList(unk2700GOCEOKPHFIO_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700GOCEOKPHFIO_ = unk2700GOCEOKPHFIO_;
        } else {
          result.unk2700GOCEOKPHFIO_ = unk2700GOCEOKPHFIOBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC other) {
        if (other == emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          if (!other.unk2700GOCEOKPHFIO_.isEmpty()) {
            if (unk2700GOCEOKPHFIO_.isEmpty()) {
              unk2700GOCEOKPHFIO_ = other.unk2700GOCEOKPHFIO_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700GOCEOKPHFIOIsMutable();
              unk2700GOCEOKPHFIO_.addAll(other.unk2700GOCEOKPHFIO_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700GOCEOKPHFIO_.isEmpty()) {
            if (unk2700GOCEOKPHFIOBuilder_.isEmpty()) {
              unk2700GOCEOKPHFIOBuilder_.dispose();
              unk2700GOCEOKPHFIOBuilder_ = null;
              unk2700GOCEOKPHFIO_ = other.unk2700GOCEOKPHFIO_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700GOCEOKPHFIOBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700GOCEOKPHFIOFieldBuilder() : null;
            } else {
              unk2700GOCEOKPHFIOBuilder_.addAllMessages(other.unk2700GOCEOKPHFIO_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> unk2700GOCEOKPHFIO_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700GOCEOKPHFIOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700GOCEOKPHFIO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ>(unk2700GOCEOKPHFIO_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder> unk2700GOCEOKPHFIOBuilder_;

      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> getUnk2700GOCEOKPHFIOList() {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700GOCEOKPHFIO_);
        } else {
          return unk2700GOCEOKPHFIOBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public int getUnk2700GOCEOKPHFIOCount() {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          return unk2700GOCEOKPHFIO_.size();
        } else {
          return unk2700GOCEOKPHFIOBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ getUnk2700GOCEOKPHFIO(int index) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          return unk2700GOCEOKPHFIO_.get(index);
        } else {
          return unk2700GOCEOKPHFIOBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder setUnk2700GOCEOKPHFIO(
          int index, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ value) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.set(index, value);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder setUnk2700GOCEOKPHFIO(
          int index, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder builderForValue) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder addUnk2700GOCEOKPHFIO(emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ value) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.add(value);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder addUnk2700GOCEOKPHFIO(
          int index, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ value) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.add(index, value);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder addUnk2700GOCEOKPHFIO(
          emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder builderForValue) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder addUnk2700GOCEOKPHFIO(
          int index, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder builderForValue) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder addAllUnk2700GOCEOKPHFIO(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ> values) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          ensureUnk2700GOCEOKPHFIOIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700GOCEOKPHFIO_);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder clearUnk2700GOCEOKPHFIO() {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          unk2700GOCEOKPHFIO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public Builder removeUnk2700GOCEOKPHFIO(int index) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          ensureUnk2700GOCEOKPHFIOIsMutable();
          unk2700GOCEOKPHFIO_.remove(index);
          onChanged();
        } else {
          unk2700GOCEOKPHFIOBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder getUnk2700GOCEOKPHFIOBuilder(
          int index) {
        return getUnk2700GOCEOKPHFIOFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder getUnk2700GOCEOKPHFIOOrBuilder(
          int index) {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          return unk2700GOCEOKPHFIO_.get(index);  } else {
          return unk2700GOCEOKPHFIOBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder> 
           getUnk2700GOCEOKPHFIOOrBuilderList() {
        if (unk2700GOCEOKPHFIOBuilder_ != null) {
          return unk2700GOCEOKPHFIOBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700GOCEOKPHFIO_);
        }
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder addUnk2700GOCEOKPHFIOBuilder() {
        return getUnk2700GOCEOKPHFIOFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder addUnk2700GOCEOKPHFIOBuilder(
          int index) {
        return getUnk2700GOCEOKPHFIOFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IEPIBFMCJNJ Unk2700_GOCEOKPHFIO = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder> 
           getUnk2700GOCEOKPHFIOBuilderList() {
        return getUnk2700GOCEOKPHFIOFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder> 
          getUnk2700GOCEOKPHFIOFieldBuilder() {
        if (unk2700GOCEOKPHFIOBuilder_ == null) {
          unk2700GOCEOKPHFIOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJ.Builder, emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.Unk2700_IEPIBFMCJNJOrBuilder>(
                  unk2700GOCEOKPHFIO_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700GOCEOKPHFIO_ = null;
        }
        return unk2700GOCEOKPHFIOBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_AKIBKKOMBMC)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_AKIBKKOMBMC)
    private static final emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC();
    }

    public static emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_AKIBKKOMBMC>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_AKIBKKOMBMC>() {
      @java.lang.Override
      public Unk2700_AKIBKKOMBMC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_AKIBKKOMBMC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_AKIBKKOMBMC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_AKIBKKOMBMC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700AKIBKKOMBMC.Unk2700_AKIBKKOMBMC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_AKIBKKOMBMC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_AKIBKKOMBMC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_AKIBKKOMBMC.proto\032\031Unk2700_IEP" +
      "IBFMCJNJ.proto\"n\n\023Unk2700_AKIBKKOMBMC\022\023\n" +
      "\013schedule_id\030\003 \001(\r\0221\n\023Unk2700_GOCEOKPHFI" +
      "O\030\014 \003(\0132\024.Unk2700_IEPIBFMCJNJ\022\017\n\007retcode" +
      "\030\004 \001(\005B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.getDescriptor(),
        });
    internal_static_Unk2700_AKIBKKOMBMC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_AKIBKKOMBMC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_AKIBKKOMBMC_descriptor,
        new java.lang.String[] { "ScheduleId", "Unk2700GOCEOKPHFIO", "Retcode", });
    emu.grasscutter.net.proto.Unk2700IEPIBFMCJNJ.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}