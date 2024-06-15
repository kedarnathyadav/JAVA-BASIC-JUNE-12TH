package com.kedarnath;
//Inheritance allows one class to inherit fields and methods from another class.
class Person{
	void speak() {
		System.out.println("This person speaks.");
	}
}
class Employee extends Person{
	void work() {
		System.out.println("This employee works.");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.speak();
		employee.work();
	}
}
