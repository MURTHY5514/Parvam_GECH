package thread_communication;

class MyThread extends Thread{
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread Execution: "+i);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();
		synchronized (t1) {
			System.out.println("Main thread calling wait method");
			t1.wait();
		}
		System.out.println("Main Thread got the notification");
		System.out.println("Mian thread completed");
	}
}
