package thread_execution_methods;

class MyThread3 implements Runnable{
	static Thread mt;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started execution");
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<20;i++) {
			System.out.println("Child Thread: "+i);
		}
		System.out.println(Thread.currentThread().getName()+" completed execution");
	}
	
}


public class JoinMethod1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread3.mt=Thread.currentThread(); //main
		Thread thread = new Thread(new MyThread3());
		thread.start();
	
		System.out.println(Thread.currentThread().getName()+"  started execution");
		for(int i=0;i<20;i++) {
			System.out.println("Main Thread: "+i);
		}
		System.out.println(Thread.currentThread().getName()+" completed execution");
//		Thread.currentThread().join();
//		System.out.println("main thread");
	}
}
