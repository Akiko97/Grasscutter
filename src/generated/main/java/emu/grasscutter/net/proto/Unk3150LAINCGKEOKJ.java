// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LAINCGKEOKJ.proto

package emu.grasscutter.net.proto;

public final class Unk3150LAINCGKEOKJ {
  private Unk3150LAINCGKEOKJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LAINCGKEOKJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LAINCGKEOKJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_CFIDFHHAHAJ = 13;</code>
     * @return The unk3250CFIDFHHAHAJ.
     */
    int getUnk3250CFIDFHHAHAJ();

    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 4187
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_LAINCGKEOKJ}
   */
  public static final class Unk3150_LAINCGKEOKJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LAINCGKEOKJ)
      Unk3150_LAINCGKEOKJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LAINCGKEOKJ.newBuilder() to construct.
    private Unk3150_LAINCGKEOKJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LAINCGKEOKJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LAINCGKEOKJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_LAINCGKEOKJ(
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

              uid_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3250CFIDFHHAHAJ_ = input.readUInt32();
              break;
            }
            case 120: {

              isAgree_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.internal_static_Unk3150_LAINCGKEOKJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.internal_static_Unk3150_LAINCGKEOKJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.class, emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.Builder.class);
    }

    public static final int UNK3250_CFIDFHHAHAJ_FIELD_NUMBER = 13;
    private int unk3250CFIDFHHAHAJ_;
    /**
     * <code>uint32 Unk3250_CFIDFHHAHAJ = 13;</code>
     * @return The unk3250CFIDFHHAHAJ.
     */
    @java.lang.Override
    public int getUnk3250CFIDFHHAHAJ() {
      return unk3250CFIDFHHAHAJ_;
    }

    public static final int IS_AGREE_FIELD_NUMBER = 15;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int UID_FIELD_NUMBER = 6;
    private int uid_;
    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (uid_ != 0) {
        output.writeUInt32(6, uid_);
      }
      if (unk3250CFIDFHHAHAJ_ != 0) {
        output.writeUInt32(13, unk3250CFIDFHHAHAJ_);
      }
      if (isAgree_ != false) {
        output.writeBool(15, isAgree_);
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
          .computeUInt32Size(6, uid_);
      }
      if (unk3250CFIDFHHAHAJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3250CFIDFHHAHAJ_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAgree_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ other = (emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ) obj;

      if (getUnk3250CFIDFHHAHAJ()
          != other.getUnk3250CFIDFHHAHAJ()) return false;
      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + UNK3250_CFIDFHHAHAJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250CFIDFHHAHAJ();
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ prototype) {
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
     * CmdId: 4187
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_LAINCGKEOKJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LAINCGKEOKJ)
        emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.internal_static_Unk3150_LAINCGKEOKJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.internal_static_Unk3150_LAINCGKEOKJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.class, emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.newBuilder()
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
        unk3250CFIDFHHAHAJ_ = 0;

        isAgree_ = false;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.internal_static_Unk3150_LAINCGKEOKJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ build() {
        emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ buildPartial() {
        emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ result = new emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ(this);
        result.unk3250CFIDFHHAHAJ_ = unk3250CFIDFHHAHAJ_;
        result.isAgree_ = isAgree_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ other) {
        if (other == emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ.getDefaultInstance()) return this;
        if (other.getUnk3250CFIDFHHAHAJ() != 0) {
          setUnk3250CFIDFHHAHAJ(other.getUnk3250CFIDFHHAHAJ());
        }
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3250CFIDFHHAHAJ_ ;
      /**
       * <code>uint32 Unk3250_CFIDFHHAHAJ = 13;</code>
       * @return The unk3250CFIDFHHAHAJ.
       */
      @java.lang.Override
      public int getUnk3250CFIDFHHAHAJ() {
        return unk3250CFIDFHHAHAJ_;
      }
      /**
       * <code>uint32 Unk3250_CFIDFHHAHAJ = 13;</code>
       * @param value The unk3250CFIDFHHAHAJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250CFIDFHHAHAJ(int value) {
        
        unk3250CFIDFHHAHAJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_CFIDFHHAHAJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250CFIDFHHAHAJ() {
        
        unk3250CFIDFHHAHAJ_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 15;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 6;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LAINCGKEOKJ)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LAINCGKEOKJ)
    private static final emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ();
    }

    public static emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LAINCGKEOKJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LAINCGKEOKJ>() {
      @java.lang.Override
      public Unk3150_LAINCGKEOKJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_LAINCGKEOKJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_LAINCGKEOKJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LAINCGKEOKJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150LAINCGKEOKJ.Unk3150_LAINCGKEOKJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LAINCGKEOKJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LAINCGKEOKJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LAINCGKEOKJ.proto\"Q\n\023Unk3150_L" +
      "AINCGKEOKJ\022\033\n\023Unk3250_CFIDFHHAHAJ\030\r \001(\r\022" +
      "\020\n\010is_agree\030\017 \001(\010\022\013\n\003uid\030\006 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LAINCGKEOKJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LAINCGKEOKJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LAINCGKEOKJ_descriptor,
        new java.lang.String[] { "Unk3250CFIDFHHAHAJ", "IsAgree", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}