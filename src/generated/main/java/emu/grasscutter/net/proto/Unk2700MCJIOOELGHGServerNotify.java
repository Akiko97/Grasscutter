// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MCJIOOELGHG_ServerNotify.proto

package emu.grasscutter.net.proto;

public final class Unk2700MCJIOOELGHGServerNotify {
  private Unk2700MCJIOOELGHGServerNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MCJIOOELGHG_ServerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MCJIOOELGHG_ServerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> 
        getUnk2700KBMKGNGFGFOList();
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF getUnk2700KBMKGNGFGFO(int index);
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    int getUnk2700KBMKGNGFGFOCount();
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder> 
        getUnk2700KBMKGNGFGFOOrBuilderList();
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder getUnk2700KBMKGNGFGFOOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 6024
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_MCJIOOELGHG_ServerNotify}
   */
  public static final class Unk2700_MCJIOOELGHG_ServerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MCJIOOELGHG_ServerNotify)
      Unk2700_MCJIOOELGHG_ServerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MCJIOOELGHG_ServerNotify.newBuilder() to construct.
    private Unk2700_MCJIOOELGHG_ServerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MCJIOOELGHG_ServerNotify() {
      unk2700KBMKGNGFGFO_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MCJIOOELGHG_ServerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_MCJIOOELGHG_ServerNotify(
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
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700KBMKGNGFGFO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700KBMKGNGFGFO_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.parser(), extensionRegistry));
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
          unk2700KBMKGNGFGFO_ = java.util.Collections.unmodifiableList(unk2700KBMKGNGFGFO_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.internal_static_Unk2700_MCJIOOELGHG_ServerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.class, emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.Builder.class);
    }

    public static final int UNK2700_KBMKGNGFGFO_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> unk2700KBMKGNGFGFO_;
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> getUnk2700KBMKGNGFGFOList() {
      return unk2700KBMKGNGFGFO_;
    }
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder> 
        getUnk2700KBMKGNGFGFOOrBuilderList() {
      return unk2700KBMKGNGFGFO_;
    }
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    @java.lang.Override
    public int getUnk2700KBMKGNGFGFOCount() {
      return unk2700KBMKGNGFGFO_.size();
    }
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF getUnk2700KBMKGNGFGFO(int index) {
      return unk2700KBMKGNGFGFO_.get(index);
    }
    /**
     * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder getUnk2700KBMKGNGFGFOOrBuilder(
        int index) {
      return unk2700KBMKGNGFGFO_.get(index);
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
      for (int i = 0; i < unk2700KBMKGNGFGFO_.size(); i++) {
        output.writeMessage(8, unk2700KBMKGNGFGFO_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700KBMKGNGFGFO_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, unk2700KBMKGNGFGFO_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify other = (emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify) obj;

      if (!getUnk2700KBMKGNGFGFOList()
          .equals(other.getUnk2700KBMKGNGFGFOList())) return false;
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
      if (getUnk2700KBMKGNGFGFOCount() > 0) {
        hash = (37 * hash) + UNK2700_KBMKGNGFGFO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700KBMKGNGFGFOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify prototype) {
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
     * CmdId: 6024
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_MCJIOOELGHG_ServerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MCJIOOELGHG_ServerNotify)
        emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.internal_static_Unk2700_MCJIOOELGHG_ServerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.class, emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.newBuilder()
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
          getUnk2700KBMKGNGFGFOFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          unk2700KBMKGNGFGFO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700KBMKGNGFGFOBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify build() {
        emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify buildPartial() {
        emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify result = new emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify(this);
        int from_bitField0_ = bitField0_;
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700KBMKGNGFGFO_ = java.util.Collections.unmodifiableList(unk2700KBMKGNGFGFO_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700KBMKGNGFGFO_ = unk2700KBMKGNGFGFO_;
        } else {
          result.unk2700KBMKGNGFGFO_ = unk2700KBMKGNGFGFOBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify other) {
        if (other == emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify.getDefaultInstance()) return this;
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          if (!other.unk2700KBMKGNGFGFO_.isEmpty()) {
            if (unk2700KBMKGNGFGFO_.isEmpty()) {
              unk2700KBMKGNGFGFO_ = other.unk2700KBMKGNGFGFO_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700KBMKGNGFGFOIsMutable();
              unk2700KBMKGNGFGFO_.addAll(other.unk2700KBMKGNGFGFO_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700KBMKGNGFGFO_.isEmpty()) {
            if (unk2700KBMKGNGFGFOBuilder_.isEmpty()) {
              unk2700KBMKGNGFGFOBuilder_.dispose();
              unk2700KBMKGNGFGFOBuilder_ = null;
              unk2700KBMKGNGFGFO_ = other.unk2700KBMKGNGFGFO_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700KBMKGNGFGFOBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700KBMKGNGFGFOFieldBuilder() : null;
            } else {
              unk2700KBMKGNGFGFOBuilder_.addAllMessages(other.unk2700KBMKGNGFGFO_);
            }
          }
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
        emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> unk2700KBMKGNGFGFO_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700KBMKGNGFGFOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700KBMKGNGFGFO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF>(unk2700KBMKGNGFGFO_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder> unk2700KBMKGNGFGFOBuilder_;

      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> getUnk2700KBMKGNGFGFOList() {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700KBMKGNGFGFO_);
        } else {
          return unk2700KBMKGNGFGFOBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public int getUnk2700KBMKGNGFGFOCount() {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          return unk2700KBMKGNGFGFO_.size();
        } else {
          return unk2700KBMKGNGFGFOBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF getUnk2700KBMKGNGFGFO(int index) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          return unk2700KBMKGNGFGFO_.get(index);
        } else {
          return unk2700KBMKGNGFGFOBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder setUnk2700KBMKGNGFGFO(
          int index, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF value) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.set(index, value);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder setUnk2700KBMKGNGFGFO(
          int index, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder builderForValue) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder addUnk2700KBMKGNGFGFO(emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF value) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.add(value);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder addUnk2700KBMKGNGFGFO(
          int index, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF value) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.add(index, value);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder addUnk2700KBMKGNGFGFO(
          emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder builderForValue) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder addUnk2700KBMKGNGFGFO(
          int index, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder builderForValue) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder addAllUnk2700KBMKGNGFGFO(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF> values) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          ensureUnk2700KBMKGNGFGFOIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700KBMKGNGFGFO_);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder clearUnk2700KBMKGNGFGFO() {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          unk2700KBMKGNGFGFO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public Builder removeUnk2700KBMKGNGFGFO(int index) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          ensureUnk2700KBMKGNGFGFOIsMutable();
          unk2700KBMKGNGFGFO_.remove(index);
          onChanged();
        } else {
          unk2700KBMKGNGFGFOBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder getUnk2700KBMKGNGFGFOBuilder(
          int index) {
        return getUnk2700KBMKGNGFGFOFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder getUnk2700KBMKGNGFGFOOrBuilder(
          int index) {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          return unk2700KBMKGNGFGFO_.get(index);  } else {
          return unk2700KBMKGNGFGFOBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder> 
           getUnk2700KBMKGNGFGFOOrBuilderList() {
        if (unk2700KBMKGNGFGFOBuilder_ != null) {
          return unk2700KBMKGNGFGFOBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700KBMKGNGFGFO_);
        }
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder addUnk2700KBMKGNGFGFOBuilder() {
        return getUnk2700KBMKGNGFGFOFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder addUnk2700KBMKGNGFGFOBuilder(
          int index) {
        return getUnk2700KBMKGNGFGFOFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_JDPMOMKAPIF Unk2700_KBMKGNGFGFO = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder> 
           getUnk2700KBMKGNGFGFOBuilderList() {
        return getUnk2700KBMKGNGFGFOFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder> 
          getUnk2700KBMKGNGFGFOFieldBuilder() {
        if (unk2700KBMKGNGFGFOBuilder_ == null) {
          unk2700KBMKGNGFGFOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIF.Builder, emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.Unk2700_JDPMOMKAPIFOrBuilder>(
                  unk2700KBMKGNGFGFO_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700KBMKGNGFGFO_ = null;
        }
        return unk2700KBMKGNGFGFOBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MCJIOOELGHG_ServerNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MCJIOOELGHG_ServerNotify)
    private static final emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify();
    }

    public static emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MCJIOOELGHG_ServerNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MCJIOOELGHG_ServerNotify>() {
      @java.lang.Override
      public Unk2700_MCJIOOELGHG_ServerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_MCJIOOELGHG_ServerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_MCJIOOELGHG_ServerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MCJIOOELGHG_ServerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700MCJIOOELGHGServerNotify.Unk2700_MCJIOOELGHG_ServerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MCJIOOELGHG_ServerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_MCJIOOELGHG_ServerNotify.proto" +
      "\032\031Unk2700_JDPMOMKAPIF.proto\"U\n Unk2700_M" +
      "CJIOOELGHG_ServerNotify\0221\n\023Unk2700_KBMKG" +
      "NGFGFO\030\010 \003(\0132\024.Unk2700_JDPMOMKAPIFB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.getDescriptor(),
        });
    internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MCJIOOELGHG_ServerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MCJIOOELGHG_ServerNotify_descriptor,
        new java.lang.String[] { "Unk2700KBMKGNGFGFO", });
    emu.grasscutter.net.proto.Unk2700JDPMOMKAPIF.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}