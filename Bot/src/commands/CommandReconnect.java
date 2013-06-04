package commands;

import bot.Main;

public class CommandReconnect extends Command {

	@Override
	public void perform() throws Exception {
		Main.disconnect();
	}

}
