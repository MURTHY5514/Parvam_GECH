package com.dependency_injection;

public class Employee {
	private String name;
	private Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// Filed injection
//		Employee employee = new Employee();
//		System.out.println("Before");
//		System.out.println(employee.name); //null
//		System.out.println(employee.address); //null
//		
//		Address address = new Address();
//		address.name = "begaluru";
//		employee.name = "Mohan";
//		employee.address = address; // field injection
//		System.out.println("After");
//		System.out.println(employee.name); //mohan
//		System.out.println(employee.address.name); // hash code/ address
		
		//setter injection
//		Address add = new Address();
//		add.setName("Bengaluru");
//		Employee emp = new Employee();
//		emp.setName("mohan");
//		emp.setAddress(add);
//		
//		System.out.println("Emp name: "+emp.getName());
//		System.out.println("Emp Address: "+emp.getAddress().getName());
		
		//constructor
		Address add = new Address("Benagaluru");
		Employee employee = new Employee("mohan", add);
		System.out.println(employee.getName());
		System.out.println(employee.getAddress().getName());
		
	}
}
