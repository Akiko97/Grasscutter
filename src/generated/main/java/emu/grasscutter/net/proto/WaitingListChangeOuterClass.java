// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WaitingListChange.proto

package emu.grasscutter.net.proto;

public final class WaitingListChangeOuterClass {
  private WaitingListChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WaitingListChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WaitingListChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_OGPCGOEIDOB = 14;</code>
     * @return The unk3250OGPCGOEIDOB.
     */
    int getUnk3250OGPCGOEIDOB();

    /**
     * <code>uint32 Unk3150_OHFNJOJKNOK = 7;</code>
     * @return The unk3150OHFNJOJKNOK.
     */
    int getUnk3150OHFNJOJKNOK();
  }
  /**
   * Protobuf type {@code WaitingListChange}
   */
  public static final class WaitingListChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WaitingListChange)
      WaitingListChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WaitingListChange.newBuilder() to construct.
    private WaitingListChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WaitingListChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WaitingListChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WaitingListChange(
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

              unk3150OHFNJOJKNOK_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3250OGPCGOEIDOB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WaitingListChangeOuterClass.internal_static_WaitingListChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WaitingListChangeOuterClass.internal_static_WaitingListChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.class, emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.Builder.class);
    }

    public static final int UNK3250_OGPCGOEIDOB_FIELD_NUMBER = 14;
    private int unk3250OGPCGOEIDOB_;
    /**
     * <code>uint32 Unk3250_OGPCGOEIDOB = 14;</code>
     * @return The unk3250OGPCGOEIDOB.
     */
    @java.lang.Override
    public int getUnk3250OGPCGOEIDOB() {
      return unk3250OGPCGOEIDOB_;
    }

    public static final int UNK3150_OHFNJOJKNOK_FIELD_NUMBER = 7;
    private int unk3150OHFNJOJKNOK_;
    /**
     * <code>uint32 Unk3150_OHFNJOJKNOK = 7;</code>
     * @return The unk3150OHFNJOJKNOK.
     */
    @java.lang.Override
    public int getUnk3150OHFNJOJKNOK() {
      return unk3150OHFNJOJKNOK_;
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
      if (unk3150OHFNJOJKNOK_ != 0) {
        output.writeUInt32(7, unk3150OHFNJOJKNOK_);
      }
      if (unk3250OGPCGOEIDOB_ != 0) {
        output.writeUInt32(14, unk3250OGPCGOEIDOB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150OHFNJOJKNOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3150OHFNJOJKNOK_);
      }
      if (unk3250OGPCGOEIDOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3250OGPCGOEIDOB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange other = (emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange) obj;

      if (getUnk3250OGPCGOEIDOB()
          != other.getUnk3250OGPCGOEIDOB()) return false;
      if (getUnk3150OHFNJOJKNOK()
          != other.getUnk3150OHFNJOJKNOK()) return false;
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
      hash = (37 * hash) + UNK3250_OGPCGOEIDOB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250OGPCGOEIDOB();
      hash = (37 * hash) + UNK3150_OHFNJOJKNOK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150OHFNJOJKNOK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange prototype) {
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
     * Protobuf type {@code WaitingListChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WaitingListChange)
        emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WaitingListChangeOuterClass.internal_static_WaitingListChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WaitingListChangeOuterClass.internal_static_WaitingListChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.class, emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.newBuilder()
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
        unk3250OGPCGOEIDOB_ = 0;

        unk3150OHFNJOJKNOK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WaitingListChangeOuterClass.internal_static_WaitingListChange_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange build() {
        emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange buildPartial() {
        emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange result = new emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange(this);
        result.unk3250OGPCGOEIDOB_ = unk3250OGPCGOEIDOB_;
        result.unk3150OHFNJOJKNOK_ = unk3150OHFNJOJKNOK_;
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
        if (other instanceof emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange) {
          return mergeFrom((emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange other) {
        if (other == emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange.getDefaultInstance()) return this;
        if (other.getUnk3250OGPCGOEIDOB() != 0) {
          setUnk3250OGPCGOEIDOB(other.getUnk3250OGPCGOEIDOB());
        }
        if (other.getUnk3150OHFNJOJKNOK() != 0) {
          setUnk3150OHFNJOJKNOK(other.getUnk3150OHFNJOJKNOK());
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
        emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3250OGPCGOEIDOB_ ;
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 14;</code>
       * @return The unk3250OGPCGOEIDOB.
       */
      @java.lang.Override
      public int getUnk3250OGPCGOEIDOB() {
        return unk3250OGPCGOEIDOB_;
      }
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 14;</code>
       * @param value The unk3250OGPCGOEIDOB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250OGPCGOEIDOB(int value) {
        
        unk3250OGPCGOEIDOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250OGPCGOEIDOB() {
        
        unk3250OGPCGOEIDOB_ = 0;
        onChanged();
        return this;
      }

      private int unk3150OHFNJOJKNOK_ ;
      /**
       * <code>uint32 Unk3150_OHFNJOJKNOK = 7;</code>
       * @return The unk3150OHFNJOJKNOK.
       */
      @java.lang.Override
      public int getUnk3150OHFNJOJKNOK() {
        return unk3150OHFNJOJKNOK_;
      }
      /**
       * <code>uint32 Unk3150_OHFNJOJKNOK = 7;</code>
       * @param value The unk3150OHFNJOJKNOK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OHFNJOJKNOK(int value) {
        
        unk3150OHFNJOJKNOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_OHFNJOJKNOK = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150OHFNJOJKNOK() {
        
        unk3150OHFNJOJKNOK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WaitingListChange)
    }

    // @@protoc_insertion_point(class_scope:WaitingListChange)
    private static final emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange();
    }

    public static emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WaitingListChange>
        PARSER = new com.google.protobuf.AbstractParser<WaitingListChange>() {
      @java.lang.Override
      public WaitingListChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WaitingListChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WaitingListChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WaitingListChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WaitingListChangeOuterClass.WaitingListChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WaitingListChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WaitingListChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027WaitingListChange.proto\"M\n\021WaitingList" +
      "Change\022\033\n\023Unk3250_OGPCGOEIDOB\030\016 \001(\r\022\033\n\023U" +
      "nk3150_OHFNJOJKNOK\030\007 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WaitingListChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WaitingListChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WaitingListChange_descriptor,
        new java.lang.String[] { "Unk3250OGPCGOEIDOB", "Unk3150OHFNJOJKNOK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}