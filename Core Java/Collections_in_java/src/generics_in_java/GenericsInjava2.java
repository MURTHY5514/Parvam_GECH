package generics_in_java;

class MyGenericClass<T>{
	private T variable1;
	public MyGenericClass(T variable1) {
		super();
		this.variable1 = variable1;
	}
	public T getVariable1() {
		return variable1;
	}
	public void setVariable1(T variable1) {
		this.variable1 = variable1;
	}	
}


public class GenericsInjava2 {
	public static void main(String[] args) {
		MyGenericClass<String> class1 = new MyGenericClass<>("Mohan");
		System.out.println(class1.getVariable1());
		class1.setVariable1("pavan");
		System.out.println(class1.getVariable1());
		
	}
}
