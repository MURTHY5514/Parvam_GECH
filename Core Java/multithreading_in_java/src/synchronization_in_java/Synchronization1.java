package synchronization_in_java;

class Display{
	public synchronized void wish(String name){ // do for synchronized
		//different
		for(int i=0;i<10;i++){
			System.out.print("Good morning: ");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
			}
			System.out.println(name);
		}
		//different
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d , String s){
		this.d=d;
		this.name=s;
	}
	public void run(){
		d.wish(name);
	}
}

public class Synchronization1 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"mohan");
		MyThread t2 = new MyThread(d,"yuvaraj");
		t1.start();
		t2.start();
	}
}

