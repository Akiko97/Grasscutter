// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_HIAFEBOCDLF.proto

package emu.grasscutter.net.proto;

public final class Unk3250HIAFEBOCDLF {
  private Unk3250HIAFEBOCDLF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_HIAFEBOCDLFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_HIAFEBOCDLF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3250_NNHEDAGDGEF = 14;</code>
     * @return The unk3250NNHEDAGDGEF.
     */
    boolean getUnk3250NNHEDAGDGEF();

    /**
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 5321
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_HIAFEBOCDLF}
   */
  public static final class Unk3250_HIAFEBOCDLF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_HIAFEBOCDLF)
      Unk3250_HIAFEBOCDLFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_HIAFEBOCDLF.newBuilder() to construct.
    private Unk3250_HIAFEBOCDLF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_HIAFEBOCDLF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_HIAFEBOCDLF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3250_HIAFEBOCDLF(
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
            case 8: {

              uid_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3250NNHEDAGDGEF_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.internal_static_Unk3250_HIAFEBOCDLF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.internal_static_Unk3250_HIAFEBOCDLF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.class, emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.Builder.class);
    }

    public static final int UNK3250_NNHEDAGDGEF_FIELD_NUMBER = 14;
    private boolean unk3250NNHEDAGDGEF_;
    /**
     * <code>bool Unk3250_NNHEDAGDGEF = 14;</code>
     * @return The unk3250NNHEDAGDGEF.
     */
    @java.lang.Override
    public boolean getUnk3250NNHEDAGDGEF() {
      return unk3250NNHEDAGDGEF_;
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
        output.writeUInt32(1, uid_);
      }
      if (unk3250NNHEDAGDGEF_ != false) {
        output.writeBool(14, unk3250NNHEDAGDGEF_);
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
      if (unk3250NNHEDAGDGEF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk3250NNHEDAGDGEF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF other = (emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF) obj;

      if (getUnk3250NNHEDAGDGEF()
          != other.getUnk3250NNHEDAGDGEF()) return false;
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
      hash = (37 * hash) + UNK3250_NNHEDAGDGEF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250NNHEDAGDGEF());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF prototype) {
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
     * CmdId: 5321
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_HIAFEBOCDLF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_HIAFEBOCDLF)
        emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.internal_static_Unk3250_HIAFEBOCDLF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.internal_static_Unk3250_HIAFEBOCDLF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.class, emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.newBuilder()
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
        unk3250NNHEDAGDGEF_ = false;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.internal_static_Unk3250_HIAFEBOCDLF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF build() {
        emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF buildPartial() {
        emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF result = new emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF(this);
        result.unk3250NNHEDAGDGEF_ = unk3250NNHEDAGDGEF_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF other) {
        if (other == emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF.getDefaultInstance()) return this;
        if (other.getUnk3250NNHEDAGDGEF() != false) {
          setUnk3250NNHEDAGDGEF(other.getUnk3250NNHEDAGDGEF());
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
        emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3250NNHEDAGDGEF_ ;
      /**
       * <code>bool Unk3250_NNHEDAGDGEF = 14;</code>
       * @return The unk3250NNHEDAGDGEF.
       */
      @java.lang.Override
      public boolean getUnk3250NNHEDAGDGEF() {
        return unk3250NNHEDAGDGEF_;
      }
      /**
       * <code>bool Unk3250_NNHEDAGDGEF = 14;</code>
       * @param value The unk3250NNHEDAGDGEF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250NNHEDAGDGEF(boolean value) {
        
        unk3250NNHEDAGDGEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_NNHEDAGDGEF = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250NNHEDAGDGEF() {
        
        unk3250NNHEDAGDGEF_ = false;
        onChanged();
        return this;
      }

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


      // @@protoc_insertion_point(builder_scope:Unk3250_HIAFEBOCDLF)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_HIAFEBOCDLF)
    private static final emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF();
    }

    public static emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_HIAFEBOCDLF>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_HIAFEBOCDLF>() {
      @java.lang.Override
      public Unk3250_HIAFEBOCDLF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3250_HIAFEBOCDLF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3250_HIAFEBOCDLF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_HIAFEBOCDLF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3250HIAFEBOCDLF.Unk3250_HIAFEBOCDLF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_HIAFEBOCDLF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_HIAFEBOCDLF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_HIAFEBOCDLF.proto\"?\n\023Unk3250_H" +
      "IAFEBOCDLF\022\033\n\023Unk3250_NNHEDAGDGEF\030\016 \001(\010\022" +
      "\013\n\003uid\030\001 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_HIAFEBOCDLF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_HIAFEBOCDLF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_HIAFEBOCDLF_descriptor,
        new java.lang.String[] { "Unk3250NNHEDAGDGEF", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}