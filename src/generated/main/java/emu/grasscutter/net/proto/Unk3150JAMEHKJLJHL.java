// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_JAMEHKJLJHL.proto

package emu.grasscutter.net.proto;

public final class Unk3150JAMEHKJLJHL {
  private Unk3150JAMEHKJLJHL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_JAMEHKJLJHLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_JAMEHKJLJHL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2800_NGGPIECNHJA = 5;</code>
     * @return The unk2800NGGPIECNHJA.
     */
    int getUnk2800NGGPIECNHJA();

    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason();

    /**
     * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
     * @return The unk3000HJKCLHGMBFC.
     */
    java.lang.String getUnk3000HJKCLHGMBFC();
    /**
     * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
     * @return The bytes for unk3000HJKCLHGMBFC.
     */
    com.google.protobuf.ByteString
        getUnk3000HJKCLHGMBFCBytes();
  }
  /**
   * Protobuf type {@code Unk3150_JAMEHKJLJHL}
   */
  public static final class Unk3150_JAMEHKJLJHL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_JAMEHKJLJHL)
      Unk3150_JAMEHKJLJHLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_JAMEHKJLJHL.newBuilder() to construct.
    private Unk3150_JAMEHKJLJHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_JAMEHKJLJHL() {
      reason_ = 0;
      unk3000HJKCLHGMBFC_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_JAMEHKJLJHL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_JAMEHKJLJHL(
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3000HJKCLHGMBFC_ = s;
              break;
            }
            case 40: {

              unk2800NGGPIECNHJA_ = input.readUInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.internal_static_Unk3150_JAMEHKJLJHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.internal_static_Unk3150_JAMEHKJLJHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.class, emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.Builder.class);
    }

    public static final int UNK2800_NGGPIECNHJA_FIELD_NUMBER = 5;
    private int unk2800NGGPIECNHJA_;
    /**
     * <code>uint32 Unk2800_NGGPIECNHJA = 5;</code>
     * @return The unk2800NGGPIECNHJA.
     */
    @java.lang.Override
    public int getUnk2800NGGPIECNHJA() {
      return unk2800NGGPIECNHJA_;
    }

    public static final int REASON_FIELD_NUMBER = 15;
    private int reason_;
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
    }

    public static final int UNK3000_HJKCLHGMBFC_FIELD_NUMBER = 3;
    private volatile java.lang.Object unk3000HJKCLHGMBFC_;
    /**
     * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
     * @return The unk3000HJKCLHGMBFC.
     */
    @java.lang.Override
    public java.lang.String getUnk3000HJKCLHGMBFC() {
      java.lang.Object ref = unk3000HJKCLHGMBFC_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3000HJKCLHGMBFC_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
     * @return The bytes for unk3000HJKCLHGMBFC.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3000HJKCLHGMBFCBytes() {
      java.lang.Object ref = unk3000HJKCLHGMBFC_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3000HJKCLHGMBFC_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3000HJKCLHGMBFC_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unk3000HJKCLHGMBFC_);
      }
      if (unk2800NGGPIECNHJA_ != 0) {
        output.writeUInt32(5, unk2800NGGPIECNHJA_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        output.writeEnum(15, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3000HJKCLHGMBFC_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unk3000HJKCLHGMBFC_);
      }
      if (unk2800NGGPIECNHJA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk2800NGGPIECNHJA_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL other = (emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL) obj;

      if (getUnk2800NGGPIECNHJA()
          != other.getUnk2800NGGPIECNHJA()) return false;
      if (reason_ != other.reason_) return false;
      if (!getUnk3000HJKCLHGMBFC()
          .equals(other.getUnk3000HJKCLHGMBFC())) return false;
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
      hash = (37 * hash) + UNK2800_NGGPIECNHJA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800NGGPIECNHJA();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + UNK3000_HJKCLHGMBFC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000HJKCLHGMBFC().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL prototype) {
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
     * Protobuf type {@code Unk3150_JAMEHKJLJHL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_JAMEHKJLJHL)
        emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.internal_static_Unk3150_JAMEHKJLJHL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.internal_static_Unk3150_JAMEHKJLJHL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.class, emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.newBuilder()
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
        unk2800NGGPIECNHJA_ = 0;

        reason_ = 0;

        unk3000HJKCLHGMBFC_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.internal_static_Unk3150_JAMEHKJLJHL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL build() {
        emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL buildPartial() {
        emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL result = new emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL(this);
        result.unk2800NGGPIECNHJA_ = unk2800NGGPIECNHJA_;
        result.reason_ = reason_;
        result.unk3000HJKCLHGMBFC_ = unk3000HJKCLHGMBFC_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL other) {
        if (other == emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL.getDefaultInstance()) return this;
        if (other.getUnk2800NGGPIECNHJA() != 0) {
          setUnk2800NGGPIECNHJA(other.getUnk2800NGGPIECNHJA());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.getUnk3000HJKCLHGMBFC().isEmpty()) {
          unk3000HJKCLHGMBFC_ = other.unk3000HJKCLHGMBFC_;
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
        emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2800NGGPIECNHJA_ ;
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 5;</code>
       * @return The unk2800NGGPIECNHJA.
       */
      @java.lang.Override
      public int getUnk2800NGGPIECNHJA() {
        return unk2800NGGPIECNHJA_;
      }
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 5;</code>
       * @param value The unk2800NGGPIECNHJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800NGGPIECNHJA(int value) {
        
        unk2800NGGPIECNHJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800NGGPIECNHJA() {
        
        unk2800NGGPIECNHJA_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object unk3000HJKCLHGMBFC_ = "";
      /**
       * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
       * @return The unk3000HJKCLHGMBFC.
       */
      public java.lang.String getUnk3000HJKCLHGMBFC() {
        java.lang.Object ref = unk3000HJKCLHGMBFC_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3000HJKCLHGMBFC_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
       * @return The bytes for unk3000HJKCLHGMBFC.
       */
      public com.google.protobuf.ByteString
          getUnk3000HJKCLHGMBFCBytes() {
        java.lang.Object ref = unk3000HJKCLHGMBFC_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3000HJKCLHGMBFC_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
       * @param value The unk3000HJKCLHGMBFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000HJKCLHGMBFC(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3000HJKCLHGMBFC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000HJKCLHGMBFC() {
        
        unk3000HJKCLHGMBFC_ = getDefaultInstance().getUnk3000HJKCLHGMBFC();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3000_HJKCLHGMBFC = 3;</code>
       * @param value The bytes for unk3000HJKCLHGMBFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000HJKCLHGMBFCBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3000HJKCLHGMBFC_ = value;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_JAMEHKJLJHL)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_JAMEHKJLJHL)
    private static final emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL();
    }

    public static emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_JAMEHKJLJHL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_JAMEHKJLJHL>() {
      @java.lang.Override
      public Unk3150_JAMEHKJLJHL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_JAMEHKJLJHL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_JAMEHKJLJHL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_JAMEHKJLJHL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150JAMEHKJLJHL.Unk3150_JAMEHKJLJHL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_JAMEHKJLJHL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_JAMEHKJLJHL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_JAMEHKJLJHL.proto\032\031Unk2700_MOF" +
      "ABPNGIKP.proto\"u\n\023Unk3150_JAMEHKJLJHL\022\033\n" +
      "\023Unk2800_NGGPIECNHJA\030\005 \001(\r\022$\n\006reason\030\017 \001" +
      "(\0162\024.Unk2700_MOFABPNGIKP\022\033\n\023Unk3000_HJKC" +
      "LHGMBFC\030\003 \001(\tB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor(),
        });
    internal_static_Unk3150_JAMEHKJLJHL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_JAMEHKJLJHL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_JAMEHKJLJHL_descriptor,
        new java.lang.String[] { "Unk2800NGGPIECNHJA", "Reason", "Unk3000HJKCLHGMBFC", });
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}