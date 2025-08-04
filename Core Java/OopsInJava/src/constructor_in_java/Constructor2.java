package constructor_in_java;

class Car{
	public String car_name;
	public float no_w;
		
	public Car(String car_name, float no_w) {
		super();
		this.car_name = car_name;
		this.no_w = no_w;
	}
}


public class Constructor2 {
	public static void main(String[] args) {
		Car c = new Car("Tesla", 4);
		System.out.println(c.car_name);
		System.out.println(c.no_w);
	}
}	
