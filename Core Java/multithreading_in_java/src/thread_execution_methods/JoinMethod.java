package thread_execution_methods;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started execution");
		for(int i=0;i<20;i++) {
			System.out.println("Child Thread: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" completed execution");
	}
	
}

public class JoinMethod {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread2());
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Main started execution");
		for(int i=0;i<20;i++) {
			System.out.println("Main Thread: "+i);
		}
		System.out.println(Thread.currentThread().getName()+" Maincompleted execution");
	}
}
