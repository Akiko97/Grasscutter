// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_AMOEOCPOMGJ_ClientReq.proto

package emu.grasscutter.net.proto;

public final class Unk2700AMOEOCPOMGJClientReq {
  private Unk2700AMOEOCPOMGJClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_AMOEOCPOMGJ_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_AMOEOCPOMGJ_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     * @return Whether the unk2700KHPPLOGFMDE field is set.
     */
    boolean hasUnk2700KHPPLOGFMDE();
    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     * @return The unk2700KHPPLOGFMDE.
     */
    emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG getUnk2700KHPPLOGFMDE();
    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     */
    emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder getUnk2700KHPPLOGFMDEOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5902
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_AMOEOCPOMGJ_ClientReq}
   */
  public static final class Unk2700_AMOEOCPOMGJ_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_AMOEOCPOMGJ_ClientReq)
      Unk2700_AMOEOCPOMGJ_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_AMOEOCPOMGJ_ClientReq.newBuilder() to construct.
    private Unk2700_AMOEOCPOMGJ_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_AMOEOCPOMGJ_ClientReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_AMOEOCPOMGJ_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_AMOEOCPOMGJ_ClientReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 114: {
              emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder subBuilder = null;
              if (unk2700KHPPLOGFMDE_ != null) {
                subBuilder = unk2700KHPPLOGFMDE_.toBuilder();
              }
              unk2700KHPPLOGFMDE_ = input.readMessage(emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk2700KHPPLOGFMDE_);
                unk2700KHPPLOGFMDE_ = subBuilder.buildPartial();
              }

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.class, emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.Builder.class);
    }

    public static final int UNK2700_KHPPLOGFMDE_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG unk2700KHPPLOGFMDE_;
    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     * @return Whether the unk2700KHPPLOGFMDE field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700KHPPLOGFMDE() {
      return unk2700KHPPLOGFMDE_ != null;
    }
    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     * @return The unk2700KHPPLOGFMDE.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG getUnk2700KHPPLOGFMDE() {
      return unk2700KHPPLOGFMDE_ == null ? emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.getDefaultInstance() : unk2700KHPPLOGFMDE_;
    }
    /**
     * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder getUnk2700KHPPLOGFMDEOrBuilder() {
      return getUnk2700KHPPLOGFMDE();
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
      if (unk2700KHPPLOGFMDE_ != null) {
        output.writeMessage(14, getUnk2700KHPPLOGFMDE());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700KHPPLOGFMDE_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getUnk2700KHPPLOGFMDE());
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq other = (emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq) obj;

      if (hasUnk2700KHPPLOGFMDE() != other.hasUnk2700KHPPLOGFMDE()) return false;
      if (hasUnk2700KHPPLOGFMDE()) {
        if (!getUnk2700KHPPLOGFMDE()
            .equals(other.getUnk2700KHPPLOGFMDE())) return false;
      }
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
      if (hasUnk2700KHPPLOGFMDE()) {
        hash = (37 * hash) + UNK2700_KHPPLOGFMDE_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700KHPPLOGFMDE().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq prototype) {
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
     * CmdId: 5902
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_AMOEOCPOMGJ_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_AMOEOCPOMGJ_ClientReq)
        emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.class, emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.newBuilder()
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
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          unk2700KHPPLOGFMDE_ = null;
        } else {
          unk2700KHPPLOGFMDE_ = null;
          unk2700KHPPLOGFMDEBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq build() {
        emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq buildPartial() {
        emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq result = new emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq(this);
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          result.unk2700KHPPLOGFMDE_ = unk2700KHPPLOGFMDE_;
        } else {
          result.unk2700KHPPLOGFMDE_ = unk2700KHPPLOGFMDEBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq other) {
        if (other == emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq.getDefaultInstance()) return this;
        if (other.hasUnk2700KHPPLOGFMDE()) {
          mergeUnk2700KHPPLOGFMDE(other.getUnk2700KHPPLOGFMDE());
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
        emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG unk2700KHPPLOGFMDE_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder> unk2700KHPPLOGFMDEBuilder_;
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       * @return Whether the unk2700KHPPLOGFMDE field is set.
       */
      public boolean hasUnk2700KHPPLOGFMDE() {
        return unk2700KHPPLOGFMDEBuilder_ != null || unk2700KHPPLOGFMDE_ != null;
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       * @return The unk2700KHPPLOGFMDE.
       */
      public emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG getUnk2700KHPPLOGFMDE() {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          return unk2700KHPPLOGFMDE_ == null ? emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.getDefaultInstance() : unk2700KHPPLOGFMDE_;
        } else {
          return unk2700KHPPLOGFMDEBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public Builder setUnk2700KHPPLOGFMDE(emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG value) {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700KHPPLOGFMDE_ = value;
          onChanged();
        } else {
          unk2700KHPPLOGFMDEBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public Builder setUnk2700KHPPLOGFMDE(
          emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder builderForValue) {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          unk2700KHPPLOGFMDE_ = builderForValue.build();
          onChanged();
        } else {
          unk2700KHPPLOGFMDEBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public Builder mergeUnk2700KHPPLOGFMDE(emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG value) {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          if (unk2700KHPPLOGFMDE_ != null) {
            unk2700KHPPLOGFMDE_ =
              emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.newBuilder(unk2700KHPPLOGFMDE_).mergeFrom(value).buildPartial();
          } else {
            unk2700KHPPLOGFMDE_ = value;
          }
          onChanged();
        } else {
          unk2700KHPPLOGFMDEBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public Builder clearUnk2700KHPPLOGFMDE() {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          unk2700KHPPLOGFMDE_ = null;
          onChanged();
        } else {
          unk2700KHPPLOGFMDE_ = null;
          unk2700KHPPLOGFMDEBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder getUnk2700KHPPLOGFMDEBuilder() {
        
        onChanged();
        return getUnk2700KHPPLOGFMDEFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      public emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder getUnk2700KHPPLOGFMDEOrBuilder() {
        if (unk2700KHPPLOGFMDEBuilder_ != null) {
          return unk2700KHPPLOGFMDEBuilder_.getMessageOrBuilder();
        } else {
          return unk2700KHPPLOGFMDE_ == null ?
              emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.getDefaultInstance() : unk2700KHPPLOGFMDE_;
        }
      }
      /**
       * <code>.Unk2700_JMPCGMBHJLG Unk2700_KHPPLOGFMDE = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder> 
          getUnk2700KHPPLOGFMDEFieldBuilder() {
        if (unk2700KHPPLOGFMDEBuilder_ == null) {
          unk2700KHPPLOGFMDEBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLG.Builder, emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.Unk2700_JMPCGMBHJLGOrBuilder>(
                  getUnk2700KHPPLOGFMDE(),
                  getParentForChildren(),
                  isClean());
          unk2700KHPPLOGFMDE_ = null;
        }
        return unk2700KHPPLOGFMDEBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_AMOEOCPOMGJ_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_AMOEOCPOMGJ_ClientReq)
    private static final emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq();
    }

    public static emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_AMOEOCPOMGJ_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_AMOEOCPOMGJ_ClientReq>() {
      @java.lang.Override
      public Unk2700_AMOEOCPOMGJ_ClientReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_AMOEOCPOMGJ_ClientReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_AMOEOCPOMGJ_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_AMOEOCPOMGJ_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700AMOEOCPOMGJClientReq.Unk2700_AMOEOCPOMGJ_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_AMOEOCPOMGJ_ClientReq.proto\032\031U" +
      "nk2700_JMPCGMBHJLG.proto\"R\n\035Unk2700_AMOE" +
      "OCPOMGJ_ClientReq\0221\n\023Unk2700_KHPPLOGFMDE" +
      "\030\016 \001(\0132\024.Unk2700_JMPCGMBHJLGB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.getDescriptor(),
        });
    internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_AMOEOCPOMGJ_ClientReq_descriptor,
        new java.lang.String[] { "Unk2700KHPPLOGFMDE", });
    emu.grasscutter.net.proto.Unk2700JMPCGMBHJLG.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}