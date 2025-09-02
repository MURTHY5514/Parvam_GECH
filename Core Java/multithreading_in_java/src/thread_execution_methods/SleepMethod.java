package thread_execution_methods;

class MyThread4 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started execution");
		for(int i=0;i<20;i++) {
			System.out.println("Child Thread: "+i);
		}
		System.out.println(Thread.currentThread().getName()+" completed execution");
	}
	
}

public class SleepMethod {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread4());
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  started execution");
		for(int i=0;i<20;i++) {
			System.out.println("Main Thread: "+i);
		}
		System.out.println(Thread.currentThread().getName()+" completed execution");
	}
}
