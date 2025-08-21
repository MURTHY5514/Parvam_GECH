package innerclasses;

import innerclasses.Car.Engine;

class Car{
	public String name= "car1";
	class Engine{
		public String name = "e1";
		public void display() {
			System.out.println("inner class:"+this.name);
			System.out.println("inner class:"+Engine.this.name);
			System.out.println("inner class:"+Car.this.name);
		}
	}
}


public class InnerClass4 {
	public static void main(String[] args) {
//		Car car = new Car();
//		Engine en = car.new Engine();
//		en.display();
		new Car().new Engine().display();
	}
}
