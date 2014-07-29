package commands;

import com.redpois0n.common.packets.Headers;

import bot.Main;

public class CommandLogPing extends Command {

	@Override
	public void perform() throws Exception {
		Main.writeByte(Headers.PACKET_LOG_PING);
	}

}
