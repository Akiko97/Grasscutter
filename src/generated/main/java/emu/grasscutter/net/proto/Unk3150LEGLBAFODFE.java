// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LEGLBAFODFE.proto

package emu.grasscutter.net.proto;

public final class Unk3150LEGLBAFODFE {
  private Unk3150LEGLBAFODFE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LEGLBAFODFEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LEGLBAFODFE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 9;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();

    /**
     * <code>uint32 scene_point_id = 14;</code>
     * @return The scenePointId.
     */
    int getScenePointId();
  }
  /**
   * Protobuf type {@code Unk3150_LEGLBAFODFE}
   */
  public static final class Unk3150_LEGLBAFODFE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LEGLBAFODFE)
      Unk3150_LEGLBAFODFEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LEGLBAFODFE.newBuilder() to construct.
    private Unk3150_LEGLBAFODFE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LEGLBAFODFE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LEGLBAFODFE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_LEGLBAFODFE(
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

              id_ = input.readUInt32();
              break;
            }
            case 72: {

              unk3250PPIHJFNMEFB_ = input.readUInt32();
              break;
            }
            case 112: {

              scenePointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.internal_static_Unk3150_LEGLBAFODFE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.internal_static_Unk3150_LEGLBAFODFE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.class, emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 9;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 9;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
    }

    public static final int SCENE_POINT_ID_FIELD_NUMBER = 14;
    private int scenePointId_;
    /**
     * <code>uint32 scene_point_id = 14;</code>
     * @return The scenePointId.
     */
    @java.lang.Override
    public int getScenePointId() {
      return scenePointId_;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(9, unk3250PPIHJFNMEFB_);
      }
      if (scenePointId_ != 0) {
        output.writeUInt32(14, scenePointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3250PPIHJFNMEFB_);
      }
      if (scenePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, scenePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE other = (emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE) obj;

      if (getId()
          != other.getId()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
      if (getScenePointId()
          != other.getScenePointId()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (37 * hash) + SCENE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScenePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE prototype) {
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
     * Protobuf type {@code Unk3150_LEGLBAFODFE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LEGLBAFODFE)
        emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.internal_static_Unk3150_LEGLBAFODFE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.internal_static_Unk3150_LEGLBAFODFE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.class, emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.newBuilder()
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
        id_ = 0;

        unk3250PPIHJFNMEFB_ = 0;

        scenePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.internal_static_Unk3150_LEGLBAFODFE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE build() {
        emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE buildPartial() {
        emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE result = new emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE(this);
        result.id_ = id_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
        result.scenePointId_ = scenePointId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE other) {
        if (other == emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
        }
        if (other.getScenePointId() != 0) {
          setScenePointId(other.getScenePointId());
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
        emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 9;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 9;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
        onChanged();
        return this;
      }

      private int scenePointId_ ;
      /**
       * <code>uint32 scene_point_id = 14;</code>
       * @return The scenePointId.
       */
      @java.lang.Override
      public int getScenePointId() {
        return scenePointId_;
      }
      /**
       * <code>uint32 scene_point_id = 14;</code>
       * @param value The scenePointId to set.
       * @return This builder for chaining.
       */
      public Builder setScenePointId(int value) {
        
        scenePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_point_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScenePointId() {
        
        scenePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LEGLBAFODFE)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LEGLBAFODFE)
    private static final emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE();
    }

    public static emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LEGLBAFODFE>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LEGLBAFODFE>() {
      @java.lang.Override
      public Unk3150_LEGLBAFODFE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_LEGLBAFODFE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_LEGLBAFODFE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LEGLBAFODFE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150LEGLBAFODFE.Unk3150_LEGLBAFODFE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LEGLBAFODFE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LEGLBAFODFE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LEGLBAFODFE.proto\"V\n\023Unk3150_L" +
      "EGLBAFODFE\022\n\n\002id\030\001 \001(\r\022\033\n\023Unk3250_PPIHJF" +
      "NMEFB\030\t \001(\r\022\026\n\016scene_point_id\030\016 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LEGLBAFODFE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LEGLBAFODFE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LEGLBAFODFE_descriptor,
        new java.lang.String[] { "Id", "Unk3250PPIHJFNMEFB", "ScenePointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}