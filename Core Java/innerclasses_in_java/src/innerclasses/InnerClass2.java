package innerclasses;

public class InnerClass2 {
	class Engine{
		public String name = "Hello";
	}
	public void m1() {
		Engine en = new Engine();
		System.out.println(en.name);
	}
	public static void main(String[] args) {
		InnerClass2 out = new InnerClass2();
		out.m1();
	}
}