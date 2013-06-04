package commands;

import com.redpois0n.common.packets.Headers;

import bot.Main;

public class CommandPing extends Command {

	@Override
	public void perform() throws Exception {
		Main.writeByte(Headers.PACKET_PING);
	}

}
