package commands;

public class CommandDisconnect extends Command {

	@Override
	public void perform() throws Exception {
		System.exit(0);
	}

}
