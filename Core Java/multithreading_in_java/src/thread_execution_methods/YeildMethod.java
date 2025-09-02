package thread_execution_methods;

class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread:  "+i);
			Thread.yield();
		}
	}
	
}

public class YeildMethod {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread: "+i);
		}
		
	}
}
