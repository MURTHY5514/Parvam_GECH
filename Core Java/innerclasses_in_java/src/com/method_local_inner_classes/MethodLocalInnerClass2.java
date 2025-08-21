package com.method_local_inner_classes;

public class MethodLocalInnerClass2 {
	public int a = 10;
	public static int b=30;
	
	public void m1() {
		int z = 20;
		final int z1 = 30;
		 final class Inner{
			public void m2() {
				System.out.println(b+" "+z+" "+z1);
			}
		}
		Inner in = new Inner();
		in.m2();
	}
	
	public static void main(String[] args) {
		new MethodLocalInnerClass2().m1();
		new MethodLocalInnerClass2().m1();
	}
}
