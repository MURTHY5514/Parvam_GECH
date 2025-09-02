package com.interupt;

class MyThread extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread running... iteration " + i);
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted! Cleaning up...");
        }
        System.out.println("Thread ends.");
    }
}

public class Interrupt1 {
	 public static void main(String[] args) {
	        MyThread t = new MyThread();
	        t.start();
	        try {
	            Thread.sleep(3000); // Let the thread run for a while
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread interrupts child thread.");
	        t.interrupt();  // Interrupt the thread
	    }
}