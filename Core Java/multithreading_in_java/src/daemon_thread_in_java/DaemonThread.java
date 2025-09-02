package daemon_thread_in_java;

public class DaemonThread {
	public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        
        System.out.println("Is main thread daemon before setting? " + mainThread.isDaemon()); //false
        
        try {
            mainThread.setDaemon(true); // attempt to make main thread daemon
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot make main thread daemon: " + e);
        }
        
        System.out.println("Is main thread daemon after attempt? " + mainThread.isDaemon());
		
		MyThread t = new MyThread();
		System.out.println("Child Threrad Before starting: "+t.isDaemon());
		t.setDaemon(true);
		System.out.println("Child Threrad After starting: "+t.isDaemon());
		t.start();
		try {
			Thread.sleep(100);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main thread Stopped");
    }
}
