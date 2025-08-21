package multithreading_in_java;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread: "+(i+1));
		}
	}
}

public class CreatingTread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start(); // one more thread will created(child1)
		myThread.start();
		System.out.println("Main Thread");
	}
}