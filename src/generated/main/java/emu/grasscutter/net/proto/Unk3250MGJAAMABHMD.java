// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_MGJAAMABHMD.proto

package emu.grasscutter.net.proto;

public final class Unk3250MGJAAMABHMD {
  private Unk3250MGJAAMABHMD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_MGJAAMABHMDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_MGJAAMABHMD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 value = 1;</code>
     * @return The value.
     */
    long getValue();
  }
  /**
   * Protobuf type {@code Unk3250_MGJAAMABHMD}
   */
  public static final class Unk3250_MGJAAMABHMD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_MGJAAMABHMD)
      Unk3250_MGJAAMABHMDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_MGJAAMABHMD.newBuilder() to construct.
    private Unk3250_MGJAAMABHMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_MGJAAMABHMD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_MGJAAMABHMD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3250_MGJAAMABHMD(
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

              value_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.internal_static_Unk3250_MGJAAMABHMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.internal_static_Unk3250_MGJAAMABHMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.class, emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;
    /**
     * <code>uint64 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
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
      if (value_ != 0L) {
        output.writeUInt64(1, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, value_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD other = (emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD) obj;

      if (getValue()
          != other.getValue()) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD prototype) {
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
     * Protobuf type {@code Unk3250_MGJAAMABHMD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_MGJAAMABHMD)
        emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.internal_static_Unk3250_MGJAAMABHMD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.internal_static_Unk3250_MGJAAMABHMD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.class, emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.newBuilder()
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
        value_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.internal_static_Unk3250_MGJAAMABHMD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD build() {
        emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD buildPartial() {
        emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD result = new emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD(this);
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD other) {
        if (other == emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD.getDefaultInstance()) return this;
        if (other.getValue() != 0L) {
          setValue(other.getValue());
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
        emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long value_ ;
      /**
       * <code>uint64 value = 1;</code>
       * @return The value.
       */
      @java.lang.Override
      public long getValue() {
        return value_;
      }
      /**
       * <code>uint64 value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(long value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_MGJAAMABHMD)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_MGJAAMABHMD)
    private static final emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD();
    }

    public static emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_MGJAAMABHMD>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_MGJAAMABHMD>() {
      @java.lang.Override
      public Unk3250_MGJAAMABHMD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3250_MGJAAMABHMD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3250_MGJAAMABHMD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_MGJAAMABHMD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3250MGJAAMABHMD.Unk3250_MGJAAMABHMD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_MGJAAMABHMD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_MGJAAMABHMD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_MGJAAMABHMD.proto\"$\n\023Unk3250_M" +
      "GJAAMABHMD\022\r\n\005value\030\001 \001(\004B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_MGJAAMABHMD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_MGJAAMABHMD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_MGJAAMABHMD_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}