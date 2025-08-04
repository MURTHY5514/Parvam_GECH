package inheritence_in_java;

class Vehicle{
	public String brand;
	public String model;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void start() {
		System.out.println(brand+" is starting");
	}
}

class Car extends Vehicle{
	public int noWheels;

	public Car(String brand, String model, int noWheels) {
		super(brand, model);
		this.noWheels = noWheels;
	}
	
	@Override
	public void start() {
		System.out.println(brand+" "+model+" is starting");
	}
}

public class INheritence2 {
	public static void main(String[] args) {
		Car c1 = new Car("Tesla", "Modelx", 4);
		c1.start();
	}
}					