package getting_setting_name_thread;

class NameOfThread implements Runnable{

	@Override
	public void run() {
//		System.out.println(10/0);
		System.out.println("child thraed: "+Thread.currentThread().getName());
	}
	
}

public class GettingName {
	public static void main(String[] args) {
		NameOfThread  nameOfThread = new NameOfThread();
		Thread th = new Thread(nameOfThread);
		th.setName("Child Thread1");
		th.start();
		Thread th1 = new Thread(nameOfThread);
		th1.start();
		Thread th2 = new Thread(nameOfThread);
		th2.start();
		System.out.println("this main method run by: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Hello main");
		System.out.println(10/0);
	}
}
