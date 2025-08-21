package com.method_local_inner_classes;

public class MethodLocalInnerClass {
	public static void m1() {  // we can do it inside static method also
		class Inner{
			public void m2() {
				System.out.println("This is method local inner class");
			}
		}
		Inner in = new Inner();
		in.m2();
	}
	
	public static void main(String[] args) {
		m1();
	}
}
