package multy_test;

public class GtaGame {
	public void printNextPlayer(String message) {
		System.out.print("[ " + message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(" ]");
	}
}
