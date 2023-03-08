package multy_test;

public class CallMe {
	public void printSomething(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ]");
	}
}
