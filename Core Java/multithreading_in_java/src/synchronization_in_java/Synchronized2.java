package synchronization_in_java;

class Display1 {
	public void wish(String name) { // do for synchronized
		// different
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good morning: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}
		// different
	}
}

class Mythread implements Runnable {
	Display d;
	String name;

	public Mythread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

}

public class Synchronized2 {
	public static void main(String[] args) throws InterruptedException {
		Display display = new Display();
		Mythread mythread = new Mythread(display, "Mohan");
		Mythread mythread1 = new Mythread(display, "Murali");
		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread1);
		t1.start();
		t2.start();
	}
}
