package multy_test;

public class Person extends Thread {
	private Toilet toilet;
	private String message;
	
	public Person(Toilet toilet, String message) {
		start();
		this.toilet = toilet;
		this.message = message;
	}
	
	@Override
	public void run() {
		synchronized (toilet) {
			toilet.printIsOpenDoor(message);
		}
	}
}
