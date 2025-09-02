package deadlock_in_java;

class A{
	public synchronized void d1(B b){
		System.out.println("Threa 1 starts execution of d1()");
		try{
			Thread.sleep(6000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread 1 tryng to call last() method");
		b.last();
	}
	public synchronized void last(){
		System.out.println("Thread A this is last() method");
	}
}
class B{
	public synchronized void d2(A a){
		System.out.println("Threa 1 starts execution of d2()");
		try{
			Thread.sleep(6000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread 1 tryng to call last() method");
		a.last();
	}
	public synchronized void last(){
		System.out.println("Thread B this is last() method");
	}
}

public class DeadLock extends Thread{
	A a = new A();
	B b = new B();
	public void m1(){
		this.start();
		a.d1(b);
	}
	public void run(){
		b.d2(a);
	}
	public static void main(String[] args){
		DeadLock d = new DeadLock();
		d.m1();
	}
}