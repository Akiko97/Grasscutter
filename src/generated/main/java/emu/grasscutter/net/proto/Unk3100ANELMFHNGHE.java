// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_ANELMFHNGHE.proto

package emu.grasscutter.net.proto;

public final class Unk3100ANELMFHNGHE {
  private Unk3100ANELMFHNGHE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_ANELMFHNGHEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_ANELMFHNGHE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3100_IFHHJEFBLNI = 7;</code>
     * @return The unk3100IFHHJEFBLNI.
     */
    int getUnk3100IFHHJEFBLNI();
  }
  /**
   * <pre>
   * CmdId: 20995
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3100_ANELMFHNGHE}
   */
  public static final class Unk3100_ANELMFHNGHE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_ANELMFHNGHE)
      Unk3100_ANELMFHNGHEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_ANELMFHNGHE.newBuilder() to construct.
    private Unk3100_ANELMFHNGHE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_ANELMFHNGHE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_ANELMFHNGHE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3100_ANELMFHNGHE(
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
            case 56: {

              unk3100IFHHJEFBLNI_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.internal_static_Unk3100_ANELMFHNGHE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.internal_static_Unk3100_ANELMFHNGHE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.class, emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.Builder.class);
    }

    public static final int UNK3100_IFHHJEFBLNI_FIELD_NUMBER = 7;
    private int unk3100IFHHJEFBLNI_;
    /**
     * <code>uint32 Unk3100_IFHHJEFBLNI = 7;</code>
     * @return The unk3100IFHHJEFBLNI.
     */
    @java.lang.Override
    public int getUnk3100IFHHJEFBLNI() {
      return unk3100IFHHJEFBLNI_;
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
      if (unk3100IFHHJEFBLNI_ != 0) {
        output.writeUInt32(7, unk3100IFHHJEFBLNI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3100IFHHJEFBLNI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3100IFHHJEFBLNI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE other = (emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE) obj;

      if (getUnk3100IFHHJEFBLNI()
          != other.getUnk3100IFHHJEFBLNI()) return false;
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
      hash = (37 * hash) + UNK3100_IFHHJEFBLNI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3100IFHHJEFBLNI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE prototype) {
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
     * CmdId: 20995
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3100_ANELMFHNGHE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_ANELMFHNGHE)
        emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.internal_static_Unk3100_ANELMFHNGHE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.internal_static_Unk3100_ANELMFHNGHE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.class, emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.newBuilder()
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
        unk3100IFHHJEFBLNI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.internal_static_Unk3100_ANELMFHNGHE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE build() {
        emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE buildPartial() {
        emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE result = new emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE(this);
        result.unk3100IFHHJEFBLNI_ = unk3100IFHHJEFBLNI_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE other) {
        if (other == emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE.getDefaultInstance()) return this;
        if (other.getUnk3100IFHHJEFBLNI() != 0) {
          setUnk3100IFHHJEFBLNI(other.getUnk3100IFHHJEFBLNI());
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
        emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3100IFHHJEFBLNI_ ;
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 7;</code>
       * @return The unk3100IFHHJEFBLNI.
       */
      @java.lang.Override
      public int getUnk3100IFHHJEFBLNI() {
        return unk3100IFHHJEFBLNI_;
      }
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 7;</code>
       * @param value The unk3100IFHHJEFBLNI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100IFHHJEFBLNI(int value) {
        
        unk3100IFHHJEFBLNI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100IFHHJEFBLNI() {
        
        unk3100IFHHJEFBLNI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3100_ANELMFHNGHE)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_ANELMFHNGHE)
    private static final emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE();
    }

    public static emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_ANELMFHNGHE>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_ANELMFHNGHE>() {
      @java.lang.Override
      public Unk3100_ANELMFHNGHE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3100_ANELMFHNGHE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3100_ANELMFHNGHE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_ANELMFHNGHE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3100ANELMFHNGHE.Unk3100_ANELMFHNGHE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_ANELMFHNGHE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_ANELMFHNGHE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_ANELMFHNGHE.proto\"2\n\023Unk3100_A" +
      "NELMFHNGHE\022\033\n\023Unk3100_IFHHJEFBLNI\030\007 \001(\rB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_ANELMFHNGHE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_ANELMFHNGHE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_ANELMFHNGHE_descriptor,
        new java.lang.String[] { "Unk3100IFHHJEFBLNI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}