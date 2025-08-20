package functional_interface;

@FunctionalInterface
interface FunInterface{
	public int add(int a, int f);
}

public class FunctionalInterfaceInJava {
	public static void main(String[] args) {
	 FunInterface inter	= (a,b)->a+b;
	 int res = inter.add(10, 2);
	 System.out.println("Res: "+res);
	}
}
