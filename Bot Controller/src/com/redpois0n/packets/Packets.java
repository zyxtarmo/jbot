package com.redpois0n.packets;

import java.util.HashMap;
import java.util.Map;

public class Packets {
	
	private static final Map<Byte, Class<? extends Packet>> packets = new HashMap<Byte, Class<? extends Packet>>();

	static {
		
	}

	public static Packet getPacket(byte identifier) throws Exception {
		Class<? extends Packet> packet = packets.get(identifier);
		
		if (packet != null) {
			return packet.newInstance();
		} else {
			return null;
		}
	}

}
