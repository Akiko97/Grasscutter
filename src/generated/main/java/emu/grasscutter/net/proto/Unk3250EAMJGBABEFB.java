// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_EAMJGBABEFB.proto

package emu.grasscutter.net.proto;

public final class Unk3250EAMJGBABEFB {
  private Unk3250EAMJGBABEFB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_EAMJGBABEFBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_EAMJGBABEFB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3250_EDNEMDELAGM = 2;</code>
     * @return The unk3250EDNEMDELAGM.
     */
    boolean getUnk3250EDNEMDELAGM();

    /**
     * <code>uint32 Unk3250_LDPGEEOEPCJ = 1;</code>
     * @return The unk3250LDPGEEOEPCJ.
     */
    int getUnk3250LDPGEEOEPCJ();
  }
  /**
   * <pre>
   * CmdId: 7963
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_EAMJGBABEFB}
   */
  public static final class Unk3250_EAMJGBABEFB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_EAMJGBABEFB)
      Unk3250_EAMJGBABEFBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_EAMJGBABEFB.newBuilder() to construct.
    private Unk3250_EAMJGBABEFB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_EAMJGBABEFB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_EAMJGBABEFB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3250_EAMJGBABEFB(
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

              unk3250LDPGEEOEPCJ_ = input.readUInt32();
              break;
            }
            case 16: {

              unk3250EDNEMDELAGM_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.internal_static_Unk3250_EAMJGBABEFB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.internal_static_Unk3250_EAMJGBABEFB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.class, emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.Builder.class);
    }

    public static final int UNK3250_EDNEMDELAGM_FIELD_NUMBER = 2;
    private boolean unk3250EDNEMDELAGM_;
    /**
     * <code>bool Unk3250_EDNEMDELAGM = 2;</code>
     * @return The unk3250EDNEMDELAGM.
     */
    @java.lang.Override
    public boolean getUnk3250EDNEMDELAGM() {
      return unk3250EDNEMDELAGM_;
    }

    public static final int UNK3250_LDPGEEOEPCJ_FIELD_NUMBER = 1;
    private int unk3250LDPGEEOEPCJ_;
    /**
     * <code>uint32 Unk3250_LDPGEEOEPCJ = 1;</code>
     * @return The unk3250LDPGEEOEPCJ.
     */
    @java.lang.Override
    public int getUnk3250LDPGEEOEPCJ() {
      return unk3250LDPGEEOEPCJ_;
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
      if (unk3250LDPGEEOEPCJ_ != 0) {
        output.writeUInt32(1, unk3250LDPGEEOEPCJ_);
      }
      if (unk3250EDNEMDELAGM_ != false) {
        output.writeBool(2, unk3250EDNEMDELAGM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250LDPGEEOEPCJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250LDPGEEOEPCJ_);
      }
      if (unk3250EDNEMDELAGM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, unk3250EDNEMDELAGM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB other = (emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB) obj;

      if (getUnk3250EDNEMDELAGM()
          != other.getUnk3250EDNEMDELAGM()) return false;
      if (getUnk3250LDPGEEOEPCJ()
          != other.getUnk3250LDPGEEOEPCJ()) return false;
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
      hash = (37 * hash) + UNK3250_EDNEMDELAGM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250EDNEMDELAGM());
      hash = (37 * hash) + UNK3250_LDPGEEOEPCJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250LDPGEEOEPCJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB prototype) {
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
     * CmdId: 7963
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_EAMJGBABEFB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_EAMJGBABEFB)
        emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.internal_static_Unk3250_EAMJGBABEFB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.internal_static_Unk3250_EAMJGBABEFB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.class, emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.newBuilder()
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
        unk3250EDNEMDELAGM_ = false;

        unk3250LDPGEEOEPCJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.internal_static_Unk3250_EAMJGBABEFB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB build() {
        emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB buildPartial() {
        emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB result = new emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB(this);
        result.unk3250EDNEMDELAGM_ = unk3250EDNEMDELAGM_;
        result.unk3250LDPGEEOEPCJ_ = unk3250LDPGEEOEPCJ_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB other) {
        if (other == emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB.getDefaultInstance()) return this;
        if (other.getUnk3250EDNEMDELAGM() != false) {
          setUnk3250EDNEMDELAGM(other.getUnk3250EDNEMDELAGM());
        }
        if (other.getUnk3250LDPGEEOEPCJ() != 0) {
          setUnk3250LDPGEEOEPCJ(other.getUnk3250LDPGEEOEPCJ());
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
        emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3250EDNEMDELAGM_ ;
      /**
       * <code>bool Unk3250_EDNEMDELAGM = 2;</code>
       * @return The unk3250EDNEMDELAGM.
       */
      @java.lang.Override
      public boolean getUnk3250EDNEMDELAGM() {
        return unk3250EDNEMDELAGM_;
      }
      /**
       * <code>bool Unk3250_EDNEMDELAGM = 2;</code>
       * @param value The unk3250EDNEMDELAGM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250EDNEMDELAGM(boolean value) {
        
        unk3250EDNEMDELAGM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_EDNEMDELAGM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250EDNEMDELAGM() {
        
        unk3250EDNEMDELAGM_ = false;
        onChanged();
        return this;
      }

      private int unk3250LDPGEEOEPCJ_ ;
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 1;</code>
       * @return The unk3250LDPGEEOEPCJ.
       */
      @java.lang.Override
      public int getUnk3250LDPGEEOEPCJ() {
        return unk3250LDPGEEOEPCJ_;
      }
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 1;</code>
       * @param value The unk3250LDPGEEOEPCJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250LDPGEEOEPCJ(int value) {
        
        unk3250LDPGEEOEPCJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250LDPGEEOEPCJ() {
        
        unk3250LDPGEEOEPCJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_EAMJGBABEFB)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_EAMJGBABEFB)
    private static final emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB();
    }

    public static emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_EAMJGBABEFB>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_EAMJGBABEFB>() {
      @java.lang.Override
      public Unk3250_EAMJGBABEFB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3250_EAMJGBABEFB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3250_EAMJGBABEFB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_EAMJGBABEFB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3250EAMJGBABEFB.Unk3250_EAMJGBABEFB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_EAMJGBABEFB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_EAMJGBABEFB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_EAMJGBABEFB.proto\"O\n\023Unk3250_E" +
      "AMJGBABEFB\022\033\n\023Unk3250_EDNEMDELAGM\030\002 \001(\010\022" +
      "\033\n\023Unk3250_LDPGEEOEPCJ\030\001 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_EAMJGBABEFB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_EAMJGBABEFB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_EAMJGBABEFB_descriptor,
        new java.lang.String[] { "Unk3250EDNEMDELAGM", "Unk3250LDPGEEOEPCJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}