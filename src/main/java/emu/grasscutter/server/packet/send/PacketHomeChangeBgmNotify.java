package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.HomeChangeBgmNotifyOuterClass.HomeChangeBgmNotify;

public class PacketHomeChangeBgmNotify extends BasePacket {
    public PacketHomeChangeBgmNotify(int homeBgmId) {
        super(PacketOpcodes.HomeChangeBgmNotify);

        var notify = HomeChangeBgmNotify.newBuilder()
            .setBgmId(homeBgmId)
            .build();

        this.setData(notify);
    }
}
