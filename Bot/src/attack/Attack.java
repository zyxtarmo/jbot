package attack;

public abstract class Attack implements Runnable {
	
	public static final int THREAD_COUNT = 5;
	
	private static boolean isFlooding;

	public static final boolean isFlooding() {
		return isFlooding;
	}

	public static final void setFlooding(boolean isFlooding) {
		Attack.isFlooding = isFlooding;
	}
	
	private String target;
	private int port;
	
	public Attack(String target, int port) {
		this.port = port;
		this.target = target;
	}

	public int getPort() {
		return port;
	}

	public String getTarget() {
		return target;
	}

	public static final void begin(int ms, Attack attack) {
		new Thread(new FloodTime(ms)).start();
		
		for (int i = 0; i < THREAD_COUNT; i++) {
			new Thread(attack).start();
		}
	}
}
