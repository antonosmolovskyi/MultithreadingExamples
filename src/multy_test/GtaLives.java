package multy_test;

public class GtaLives extends Thread{
	private GtaGame gta;
	private String message;
	
	public GtaLives(GtaGame gta, String message) {
		start();
		this.gta = gta;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (gta) {
			gta.printNextPlayer(message);
		}
	}
}
