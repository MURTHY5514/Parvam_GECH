package thread_priority;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("This is Child Method");
		System.out.println("The name of thread: "+Thread.currentThread().getName());
		System.out.println("The priority: "+Thread.currentThread().getPriority());
	}
	
}

public class ThreadPriority {
	public static void main(String[] args) {
		MyThread myThread = new  MyThread();
		Thread thread = new Thread(myThread);
		thread.setPriority(Thread.MAX_PRIORITY); //10
		thread.start();
		System.out.println("Main Method name of thread: "+Thread.currentThread().getName());
		System.out.println("Main Method priority: "+Thread.currentThread().getPriority());
	}
}
