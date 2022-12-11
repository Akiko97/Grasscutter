package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.FireworksReformDataNotifyOuterClass.FireworksReformDataNotify;
import emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData;

public class PacketFireworksReformDataNotify extends BasePacket {
    public PacketFireworksReformDataNotify(FireworksReformData notify) {
        super(PacketOpcodes.FireworksReformDataNotify);

        var proto = FireworksReformDataNotify.newBuilder();
        proto.addFireworksReformDataList(notify);

        setData(proto.build());
    }
}
