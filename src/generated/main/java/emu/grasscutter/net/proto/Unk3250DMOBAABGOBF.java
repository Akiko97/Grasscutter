// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_DMOBAABGOBF.proto

package emu.grasscutter.net.proto;

public final class Unk3250DMOBAABGOBF {
  private Unk3250DMOBAABGOBF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_DMOBAABGOBFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_DMOBAABGOBF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 6;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
     * @return The unk3250NKHMMPMEILJ.
     */
    java.lang.String getUnk3250NKHMMPMEILJ();
    /**
     * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
     * @return The bytes for unk3250NKHMMPMEILJ.
     */
    com.google.protobuf.ByteString
        getUnk3250NKHMMPMEILJBytes();

    /**
     * <code>string Unk3250_JOCKIGCENGI = 13;</code>
     * @return The unk3250JOCKIGCENGI.
     */
    java.lang.String getUnk3250JOCKIGCENGI();
    /**
     * <code>string Unk3250_JOCKIGCENGI = 13;</code>
     * @return The bytes for unk3250JOCKIGCENGI.
     */
    com.google.protobuf.ByteString
        getUnk3250JOCKIGCENGIBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7193;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code Unk3250_DMOBAABGOBF}
   */
  public static final class Unk3250_DMOBAABGOBF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_DMOBAABGOBF)
      Unk3250_DMOBAABGOBFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_DMOBAABGOBF.newBuilder() to construct.
    private Unk3250_DMOBAABGOBF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_DMOBAABGOBF() {
      unk3250NKHMMPMEILJ_ = "";
      unk3250JOCKIGCENGI_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_DMOBAABGOBF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3250_DMOBAABGOBF(
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
            case 48: {

              isSuccess_ = input.readBool();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3250NKHMMPMEILJ_ = s;
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3250JOCKIGCENGI_ = s;
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
      return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.internal_static_Unk3250_DMOBAABGOBF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.internal_static_Unk3250_DMOBAABGOBF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.class, emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 6;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 6;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int UNK3250_NKHMMPMEILJ_FIELD_NUMBER = 7;
    private volatile java.lang.Object unk3250NKHMMPMEILJ_;
    /**
     * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
     * @return The unk3250NKHMMPMEILJ.
     */
    @java.lang.Override
    public java.lang.String getUnk3250NKHMMPMEILJ() {
      java.lang.Object ref = unk3250NKHMMPMEILJ_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3250NKHMMPMEILJ_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
     * @return The bytes for unk3250NKHMMPMEILJ.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3250NKHMMPMEILJBytes() {
      java.lang.Object ref = unk3250NKHMMPMEILJ_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3250NKHMMPMEILJ_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3250_JOCKIGCENGI_FIELD_NUMBER = 13;
    private volatile java.lang.Object unk3250JOCKIGCENGI_;
    /**
     * <code>string Unk3250_JOCKIGCENGI = 13;</code>
     * @return The unk3250JOCKIGCENGI.
     */
    @java.lang.Override
    public java.lang.String getUnk3250JOCKIGCENGI() {
      java.lang.Object ref = unk3250JOCKIGCENGI_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3250JOCKIGCENGI_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3250_JOCKIGCENGI = 13;</code>
     * @return The bytes for unk3250JOCKIGCENGI.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3250JOCKIGCENGIBytes() {
      java.lang.Object ref = unk3250JOCKIGCENGI_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3250JOCKIGCENGI_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (isSuccess_ != false) {
        output.writeBool(6, isSuccess_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250NKHMMPMEILJ_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, unk3250NKHMMPMEILJ_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250JOCKIGCENGI_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, unk3250JOCKIGCENGI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isSuccess_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250NKHMMPMEILJ_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, unk3250NKHMMPMEILJ_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250JOCKIGCENGI_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, unk3250JOCKIGCENGI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF other = (emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (!getUnk3250NKHMMPMEILJ()
          .equals(other.getUnk3250NKHMMPMEILJ())) return false;
      if (!getUnk3250JOCKIGCENGI()
          .equals(other.getUnk3250JOCKIGCENGI())) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + UNK3250_NKHMMPMEILJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250NKHMMPMEILJ().hashCode();
      hash = (37 * hash) + UNK3250_JOCKIGCENGI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250JOCKIGCENGI().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 7193;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code Unk3250_DMOBAABGOBF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_DMOBAABGOBF)
        emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.internal_static_Unk3250_DMOBAABGOBF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.internal_static_Unk3250_DMOBAABGOBF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.class, emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.newBuilder()
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
        isSuccess_ = false;

        unk3250NKHMMPMEILJ_ = "";

        unk3250JOCKIGCENGI_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.internal_static_Unk3250_DMOBAABGOBF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF build() {
        emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF buildPartial() {
        emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF result = new emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF(this);
        result.isSuccess_ = isSuccess_;
        result.unk3250NKHMMPMEILJ_ = unk3250NKHMMPMEILJ_;
        result.unk3250JOCKIGCENGI_ = unk3250JOCKIGCENGI_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF other) {
        if (other == emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (!other.getUnk3250NKHMMPMEILJ().isEmpty()) {
          unk3250NKHMMPMEILJ_ = other.unk3250NKHMMPMEILJ_;
          onChanged();
        }
        if (!other.getUnk3250JOCKIGCENGI().isEmpty()) {
          unk3250JOCKIGCENGI_ = other.unk3250JOCKIGCENGI_;
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
        emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 6;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 6;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object unk3250NKHMMPMEILJ_ = "";
      /**
       * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
       * @return The unk3250NKHMMPMEILJ.
       */
      public java.lang.String getUnk3250NKHMMPMEILJ() {
        java.lang.Object ref = unk3250NKHMMPMEILJ_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3250NKHMMPMEILJ_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
       * @return The bytes for unk3250NKHMMPMEILJ.
       */
      public com.google.protobuf.ByteString
          getUnk3250NKHMMPMEILJBytes() {
        java.lang.Object ref = unk3250NKHMMPMEILJ_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3250NKHMMPMEILJ_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
       * @param value The unk3250NKHMMPMEILJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250NKHMMPMEILJ(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3250NKHMMPMEILJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250NKHMMPMEILJ() {
        
        unk3250NKHMMPMEILJ_ = getDefaultInstance().getUnk3250NKHMMPMEILJ();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_NKHMMPMEILJ = 7;</code>
       * @param value The bytes for unk3250NKHMMPMEILJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250NKHMMPMEILJBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3250NKHMMPMEILJ_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object unk3250JOCKIGCENGI_ = "";
      /**
       * <code>string Unk3250_JOCKIGCENGI = 13;</code>
       * @return The unk3250JOCKIGCENGI.
       */
      public java.lang.String getUnk3250JOCKIGCENGI() {
        java.lang.Object ref = unk3250JOCKIGCENGI_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3250JOCKIGCENGI_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3250_JOCKIGCENGI = 13;</code>
       * @return The bytes for unk3250JOCKIGCENGI.
       */
      public com.google.protobuf.ByteString
          getUnk3250JOCKIGCENGIBytes() {
        java.lang.Object ref = unk3250JOCKIGCENGI_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3250JOCKIGCENGI_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3250_JOCKIGCENGI = 13;</code>
       * @param value The unk3250JOCKIGCENGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JOCKIGCENGI(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3250JOCKIGCENGI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_JOCKIGCENGI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JOCKIGCENGI() {
        
        unk3250JOCKIGCENGI_ = getDefaultInstance().getUnk3250JOCKIGCENGI();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_JOCKIGCENGI = 13;</code>
       * @param value The bytes for unk3250JOCKIGCENGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JOCKIGCENGIBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3250JOCKIGCENGI_ = value;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_DMOBAABGOBF)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_DMOBAABGOBF)
    private static final emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF();
    }

    public static emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_DMOBAABGOBF>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_DMOBAABGOBF>() {
      @java.lang.Override
      public Unk3250_DMOBAABGOBF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3250_DMOBAABGOBF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3250_DMOBAABGOBF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_DMOBAABGOBF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3250DMOBAABGOBF.Unk3250_DMOBAABGOBF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_DMOBAABGOBF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_DMOBAABGOBF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_DMOBAABGOBF.proto\"c\n\023Unk3250_D" +
      "MOBAABGOBF\022\022\n\nis_success\030\006 \001(\010\022\033\n\023Unk325" +
      "0_NKHMMPMEILJ\030\007 \001(\t\022\033\n\023Unk3250_JOCKIGCEN" +
      "GI\030\r \001(\tB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_DMOBAABGOBF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_DMOBAABGOBF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_DMOBAABGOBF_descriptor,
        new java.lang.String[] { "IsSuccess", "Unk3250NKHMMPMEILJ", "Unk3250JOCKIGCENGI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}