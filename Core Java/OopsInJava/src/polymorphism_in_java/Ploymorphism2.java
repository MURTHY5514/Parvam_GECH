package polymorphism_in_java;

class Shape{
	public void area() {
		System.out.println("Calculating area...");
	}
}

class Circle extends Shape{
	//pi*r*r
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void area() {
		double area = 3.14*this.r*r;
		System.out.println("The area is circle is: "+area);
	}
	
}

public class Ploymorphism2 {
	public static void main(String[] args) {
		Shape c = new Circle(2); // up casting
		c.area();
	}
}
