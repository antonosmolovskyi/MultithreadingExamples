package multy_test;

public class ThreadMulty implements Runnable {
	private int age;
	private String name;
	private boolean isPause = true;

	public ThreadMulty(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}

	public void setPause() {
		isPause = true;
	}

	public synchronized void setStart() {
		isPause = false;
		notify();
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			if(isPause) {
				synchronized (this) {  //any of other objects not just this..
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
			}
			System.out.println("Hello " + name + ", you are " + age++ + " y.o. now, niiigga");
		}

	}

}
