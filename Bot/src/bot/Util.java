package bot;

import java.io.File;

public class Util {

	public static File getJarFile() {
		return new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().replace("file:", ""));
	}

}
