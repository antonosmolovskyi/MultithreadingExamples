package multy_test;

public class Caller extends Thread {
	private CallMe callMe;
	private String message;
	public Caller(CallMe callMe, String message) {
		start();
		this.callMe = callMe;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (callMe) {
			callMe.printSomething(message);
		}
	}
}
