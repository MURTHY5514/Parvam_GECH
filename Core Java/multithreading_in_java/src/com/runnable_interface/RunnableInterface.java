package com.runnable_interface;

class ThreadClass implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

	public void start() {
		System.out.println("start");
	}
	
}

public class RunnableInterface {
	public static void main(String[] args) {
		ThreadClass class1 = new ThreadClass();
		Thread th = new Thread(class1);
		Thread th1 = new Thread();
		th.start();
		th1.start(); //you get empty output
		class1.start(); //it will call method normally
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
