package multy_test;

public class MainMulty {

	public static void main(String[] args) {
		ThreadMulty threadMulty = new ThreadMulty(10, "Anton");
		Thread thread = new Thread(threadMulty);
		thread.start();
		System.out.println(Thread.activeCount());
		System.out.println("OK");
		threadMulty.setPause();
		System.out.println("END");
		threadMulty.setStart();
	}

}
