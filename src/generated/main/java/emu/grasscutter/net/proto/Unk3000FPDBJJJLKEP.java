// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_FPDBJJJLKEP.proto

package emu.grasscutter.net.proto;

public final class Unk3000FPDBJJJLKEP {
  private Unk3000FPDBJJJLKEP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_FPDBJJJLKEPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_FPDBJJJLKEP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     * @return Whether the unk3000ADJJOGDKIKL field is set.
     */
    boolean hasUnk3000ADJJOGDKIKL();
    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     * @return The unk3000ADJJOGDKIKL.
     */
    emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA getUnk3000ADJJOGDKIKL();
    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     */
    emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder getUnk3000ADJJOGDKIKLOrBuilder();

    /**
     * <code>int32 query_id = 14;</code>
     * @return The queryId.
     */
    int getQueryId();
  }
  /**
   * <pre>
   * CmdId: 6198
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_FPDBJJJLKEP}
   */
  public static final class Unk3000_FPDBJJJLKEP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_FPDBJJJLKEP)
      Unk3000_FPDBJJJLKEPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_FPDBJJJLKEP.newBuilder() to construct.
    private Unk3000_FPDBJJJLKEP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_FPDBJJJLKEP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_FPDBJJJLKEP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_FPDBJJJLKEP(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder subBuilder = null;
              if (unk3000ADJJOGDKIKL_ != null) {
                subBuilder = unk3000ADJJOGDKIKL_.toBuilder();
              }
              unk3000ADJJOGDKIKL_ = input.readMessage(emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk3000ADJJOGDKIKL_);
                unk3000ADJJOGDKIKL_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              queryId_ = input.readInt32();
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
      return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.internal_static_Unk3000_FPDBJJJLKEP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.internal_static_Unk3000_FPDBJJJLKEP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.class, emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3000_ADJJOGDKIKL_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA unk3000ADJJOGDKIKL_;
    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     * @return Whether the unk3000ADJJOGDKIKL field is set.
     */
    @java.lang.Override
    public boolean hasUnk3000ADJJOGDKIKL() {
      return unk3000ADJJOGDKIKL_ != null;
    }
    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     * @return The unk3000ADJJOGDKIKL.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA getUnk3000ADJJOGDKIKL() {
      return unk3000ADJJOGDKIKL_ == null ? emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.getDefaultInstance() : unk3000ADJJOGDKIKL_;
    }
    /**
     * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder getUnk3000ADJJOGDKIKLOrBuilder() {
      return getUnk3000ADJJOGDKIKL();
    }

    public static final int QUERY_ID_FIELD_NUMBER = 14;
    private int queryId_;
    /**
     * <code>int32 query_id = 14;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (unk3000ADJJOGDKIKL_ != null) {
        output.writeMessage(11, getUnk3000ADJJOGDKIKL());
      }
      if (queryId_ != 0) {
        output.writeInt32(14, queryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (unk3000ADJJOGDKIKL_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getUnk3000ADJJOGDKIKL());
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, queryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP other = (emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasUnk3000ADJJOGDKIKL() != other.hasUnk3000ADJJOGDKIKL()) return false;
      if (hasUnk3000ADJJOGDKIKL()) {
        if (!getUnk3000ADJJOGDKIKL()
            .equals(other.getUnk3000ADJJOGDKIKL())) return false;
      }
      if (getQueryId()
          != other.getQueryId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasUnk3000ADJJOGDKIKL()) {
        hash = (37 * hash) + UNK3000_ADJJOGDKIKL_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000ADJJOGDKIKL().hashCode();
      }
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP prototype) {
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
     * CmdId: 6198
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_FPDBJJJLKEP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_FPDBJJJLKEP)
        emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.internal_static_Unk3000_FPDBJJJLKEP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.internal_static_Unk3000_FPDBJJJLKEP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.class, emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.newBuilder()
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
        retcode_ = 0;

        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          unk3000ADJJOGDKIKL_ = null;
        } else {
          unk3000ADJJOGDKIKL_ = null;
          unk3000ADJJOGDKIKLBuilder_ = null;
        }
        queryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.internal_static_Unk3000_FPDBJJJLKEP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP build() {
        emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP buildPartial() {
        emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP result = new emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP(this);
        result.retcode_ = retcode_;
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          result.unk3000ADJJOGDKIKL_ = unk3000ADJJOGDKIKL_;
        } else {
          result.unk3000ADJJOGDKIKL_ = unk3000ADJJOGDKIKLBuilder_.build();
        }
        result.queryId_ = queryId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP other) {
        if (other == emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasUnk3000ADJJOGDKIKL()) {
          mergeUnk3000ADJJOGDKIKL(other.getUnk3000ADJJOGDKIKL());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
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
        emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA unk3000ADJJOGDKIKL_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder> unk3000ADJJOGDKIKLBuilder_;
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       * @return Whether the unk3000ADJJOGDKIKL field is set.
       */
      public boolean hasUnk3000ADJJOGDKIKL() {
        return unk3000ADJJOGDKIKLBuilder_ != null || unk3000ADJJOGDKIKL_ != null;
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       * @return The unk3000ADJJOGDKIKL.
       */
      public emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA getUnk3000ADJJOGDKIKL() {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          return unk3000ADJJOGDKIKL_ == null ? emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.getDefaultInstance() : unk3000ADJJOGDKIKL_;
        } else {
          return unk3000ADJJOGDKIKLBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public Builder setUnk3000ADJJOGDKIKL(emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA value) {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk3000ADJJOGDKIKL_ = value;
          onChanged();
        } else {
          unk3000ADJJOGDKIKLBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public Builder setUnk3000ADJJOGDKIKL(
          emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder builderForValue) {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          unk3000ADJJOGDKIKL_ = builderForValue.build();
          onChanged();
        } else {
          unk3000ADJJOGDKIKLBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public Builder mergeUnk3000ADJJOGDKIKL(emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA value) {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          if (unk3000ADJJOGDKIKL_ != null) {
            unk3000ADJJOGDKIKL_ =
              emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.newBuilder(unk3000ADJJOGDKIKL_).mergeFrom(value).buildPartial();
          } else {
            unk3000ADJJOGDKIKL_ = value;
          }
          onChanged();
        } else {
          unk3000ADJJOGDKIKLBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public Builder clearUnk3000ADJJOGDKIKL() {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          unk3000ADJJOGDKIKL_ = null;
          onChanged();
        } else {
          unk3000ADJJOGDKIKL_ = null;
          unk3000ADJJOGDKIKLBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder getUnk3000ADJJOGDKIKLBuilder() {
        
        onChanged();
        return getUnk3000ADJJOGDKIKLFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder getUnk3000ADJJOGDKIKLOrBuilder() {
        if (unk3000ADJJOGDKIKLBuilder_ != null) {
          return unk3000ADJJOGDKIKLBuilder_.getMessageOrBuilder();
        } else {
          return unk3000ADJJOGDKIKL_ == null ?
              emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.getDefaultInstance() : unk3000ADJJOGDKIKL_;
        }
      }
      /**
       * <code>.Unk3000_BGPMEPKCLPA Unk3000_ADJJOGDKIKL = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder> 
          getUnk3000ADJJOGDKIKLFieldBuilder() {
        if (unk3000ADJJOGDKIKLBuilder_ == null) {
          unk3000ADJJOGDKIKLBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPA.Builder, emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.Unk3000_BGPMEPKCLPAOrBuilder>(
                  getUnk3000ADJJOGDKIKL(),
                  getParentForChildren(),
                  isClean());
          unk3000ADJJOGDKIKL_ = null;
        }
        return unk3000ADJJOGDKIKLBuilder_;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 14;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 14;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_FPDBJJJLKEP)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_FPDBJJJLKEP)
    private static final emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP();
    }

    public static emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_FPDBJJJLKEP>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_FPDBJJJLKEP>() {
      @java.lang.Override
      public Unk3000_FPDBJJJLKEP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_FPDBJJJLKEP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_FPDBJJJLKEP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_FPDBJJJLKEP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000FPDBJJJLKEP.Unk3000_FPDBJJJLKEP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_FPDBJJJLKEP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_FPDBJJJLKEP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_FPDBJJJLKEP.proto\032\031Unk3000_BGP" +
      "MEPKCLPA.proto\"k\n\023Unk3000_FPDBJJJLKEP\022\017\n" +
      "\007retcode\030\010 \001(\005\0221\n\023Unk3000_ADJJOGDKIKL\030\013 " +
      "\001(\0132\024.Unk3000_BGPMEPKCLPA\022\020\n\010query_id\030\016 " +
      "\001(\005B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.getDescriptor(),
        });
    internal_static_Unk3000_FPDBJJJLKEP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_FPDBJJJLKEP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_FPDBJJJLKEP_descriptor,
        new java.lang.String[] { "Retcode", "Unk3000ADJJOGDKIKL", "QueryId", });
    emu.grasscutter.net.proto.Unk3000BGPMEPKCLPA.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}