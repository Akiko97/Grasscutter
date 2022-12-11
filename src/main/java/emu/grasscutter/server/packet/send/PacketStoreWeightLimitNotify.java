package emu.grasscutter.server.packet.send;

import static emu.grasscutter.config.Configuration.*;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType;
import emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify;

public class PacketStoreWeightLimitNotify extends BasePacket {

    public PacketStoreWeightLimitNotify() {
        super(PacketOpcodes.StoreWeightLimitNotify);

        StoreWeightLimitNotify p = StoreWeightLimitNotify.newBuilder()
                .setStoreType(StoreType.STORE_TYPE_PACK)
                .setWeightLimit(INVENTORY_LIMITS.all)
                .setUnk3250NIKMCBLHFNJ(INVENTORY_LIMITS.weapons)
                .setUnk3250ICDKCEOJKKG(INVENTORY_LIMITS.relics)
                .setUnk3250JGPODDEKAPB(INVENTORY_LIMITS.materials)
                .setUnk3250OONMFCGDMMF(INVENTORY_LIMITS.furniture)
                .build();

        this.setData(p);
    }
}
