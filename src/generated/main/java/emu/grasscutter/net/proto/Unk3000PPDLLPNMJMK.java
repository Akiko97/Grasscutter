// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_PPDLLPNMJMK.proto

package emu.grasscutter.net.proto;

public final class Unk3000PPDLLPNMJMK {
  private Unk3000PPDLLPNMJMK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_PPDLLPNMJMKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_PPDLLPNMJMK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3000_CFDMLGKNLKL = 1;</code>
     * @return The unk3000CFDMLGKNLKL.
     */
    int getUnk3000CFDMLGKNLKL();

    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 2;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    int getUnk3000CIOLEGEHDAC();
  }
  /**
   * <pre>
   * CmdId: 435
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_PPDLLPNMJMK}
   */
  public static final class Unk3000_PPDLLPNMJMK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_PPDLLPNMJMK)
      Unk3000_PPDLLPNMJMKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_PPDLLPNMJMK.newBuilder() to construct.
    private Unk3000_PPDLLPNMJMK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_PPDLLPNMJMK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_PPDLLPNMJMK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_PPDLLPNMJMK(
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

              unk3000CFDMLGKNLKL_ = input.readUInt32();
              break;
            }
            case 16: {

              unk3000CIOLEGEHDAC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.internal_static_Unk3000_PPDLLPNMJMK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.internal_static_Unk3000_PPDLLPNMJMK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.class, emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.Builder.class);
    }

    public static final int UNK3000_CFDMLGKNLKL_FIELD_NUMBER = 1;
    private int unk3000CFDMLGKNLKL_;
    /**
     * <code>uint32 Unk3000_CFDMLGKNLKL = 1;</code>
     * @return The unk3000CFDMLGKNLKL.
     */
    @java.lang.Override
    public int getUnk3000CFDMLGKNLKL() {
      return unk3000CFDMLGKNLKL_;
    }

    public static final int UNK3000_CIOLEGEHDAC_FIELD_NUMBER = 2;
    private int unk3000CIOLEGEHDAC_;
    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 2;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    @java.lang.Override
    public int getUnk3000CIOLEGEHDAC() {
      return unk3000CIOLEGEHDAC_;
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
      if (unk3000CFDMLGKNLKL_ != 0) {
        output.writeUInt32(1, unk3000CFDMLGKNLKL_);
      }
      if (unk3000CIOLEGEHDAC_ != 0) {
        output.writeUInt32(2, unk3000CIOLEGEHDAC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000CFDMLGKNLKL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3000CFDMLGKNLKL_);
      }
      if (unk3000CIOLEGEHDAC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3000CIOLEGEHDAC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK other = (emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK) obj;

      if (getUnk3000CFDMLGKNLKL()
          != other.getUnk3000CFDMLGKNLKL()) return false;
      if (getUnk3000CIOLEGEHDAC()
          != other.getUnk3000CIOLEGEHDAC()) return false;
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
      hash = (37 * hash) + UNK3000_CFDMLGKNLKL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CFDMLGKNLKL();
      hash = (37 * hash) + UNK3000_CIOLEGEHDAC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CIOLEGEHDAC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK prototype) {
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
     * CmdId: 435
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_PPDLLPNMJMK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_PPDLLPNMJMK)
        emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.internal_static_Unk3000_PPDLLPNMJMK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.internal_static_Unk3000_PPDLLPNMJMK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.class, emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.newBuilder()
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
        unk3000CFDMLGKNLKL_ = 0;

        unk3000CIOLEGEHDAC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.internal_static_Unk3000_PPDLLPNMJMK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK build() {
        emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK buildPartial() {
        emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK result = new emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK(this);
        result.unk3000CFDMLGKNLKL_ = unk3000CFDMLGKNLKL_;
        result.unk3000CIOLEGEHDAC_ = unk3000CIOLEGEHDAC_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK other) {
        if (other == emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK.getDefaultInstance()) return this;
        if (other.getUnk3000CFDMLGKNLKL() != 0) {
          setUnk3000CFDMLGKNLKL(other.getUnk3000CFDMLGKNLKL());
        }
        if (other.getUnk3000CIOLEGEHDAC() != 0) {
          setUnk3000CIOLEGEHDAC(other.getUnk3000CIOLEGEHDAC());
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
        emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3000CFDMLGKNLKL_ ;
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 1;</code>
       * @return The unk3000CFDMLGKNLKL.
       */
      @java.lang.Override
      public int getUnk3000CFDMLGKNLKL() {
        return unk3000CFDMLGKNLKL_;
      }
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 1;</code>
       * @param value The unk3000CFDMLGKNLKL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CFDMLGKNLKL(int value) {
        
        unk3000CFDMLGKNLKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CFDMLGKNLKL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CFDMLGKNLKL() {
        
        unk3000CFDMLGKNLKL_ = 0;
        onChanged();
        return this;
      }

      private int unk3000CIOLEGEHDAC_ ;
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 2;</code>
       * @return The unk3000CIOLEGEHDAC.
       */
      @java.lang.Override
      public int getUnk3000CIOLEGEHDAC() {
        return unk3000CIOLEGEHDAC_;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 2;</code>
       * @param value The unk3000CIOLEGEHDAC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CIOLEGEHDAC(int value) {
        
        unk3000CIOLEGEHDAC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CIOLEGEHDAC() {
        
        unk3000CIOLEGEHDAC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_PPDLLPNMJMK)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_PPDLLPNMJMK)
    private static final emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK();
    }

    public static emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_PPDLLPNMJMK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_PPDLLPNMJMK>() {
      @java.lang.Override
      public Unk3000_PPDLLPNMJMK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_PPDLLPNMJMK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_PPDLLPNMJMK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_PPDLLPNMJMK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000PPDLLPNMJMK.Unk3000_PPDLLPNMJMK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_PPDLLPNMJMK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_PPDLLPNMJMK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_PPDLLPNMJMK.proto\"O\n\023Unk3000_P" +
      "PDLLPNMJMK\022\033\n\023Unk3000_CFDMLGKNLKL\030\001 \001(\r\022" +
      "\033\n\023Unk3000_CIOLEGEHDAC\030\002 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_PPDLLPNMJMK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_PPDLLPNMJMK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_PPDLLPNMJMK_descriptor,
        new java.lang.String[] { "Unk3000CFDMLGKNLKL", "Unk3000CIOLEGEHDAC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}