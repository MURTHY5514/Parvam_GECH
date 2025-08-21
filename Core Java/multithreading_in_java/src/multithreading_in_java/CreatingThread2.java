package multithreading_in_java;

class ParentThread extends Thread{	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("Child thread");
		}
	}
	@Override
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	
}

public class CreatingThread2 {
	public static void main(String[] args) {
		ParentThread parentThread = new ParentThread();
		parentThread.start();
		System.out.println("Main thread");
		for(int i = 0;i<10;i++) {
			System.out.println("Main thread");
		}
		
	}
}
