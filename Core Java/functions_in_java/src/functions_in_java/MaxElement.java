package functions_in_java;

public class MaxElement {
	public void max(int a, int b, int c) {
		if(a>=b && a>=c) {
			System.out.println("The max element is: "+a);
		}else if(b>=a && b>=c) {
			System.out.println("The max element is: "+b);
		}else {
			System.out.println("The max element is: "+c);
		}
	}
	public static void main(String[] args) {
		
	}
}
