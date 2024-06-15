package com.kedarnath;

//An abstract class cannot be instantiated and 
//may contain abstract methods, which are methods
//without a body that must be implemented by subclasses.

abstract class Vehicle{
	abstract void move();
	
	void start() {
		System.out.println("Vehicle is starting.");
	}
}
class Car1 extends Vehicle{

	@Override
	void move() {
		System.out.println("Car is moving.");
	}
	
}

interface Flying {
	abstract void fly();
	
}
class Airplane extends Vehicle implements Flying{

	@Override
	public void fly() {
		System.out.println("Airplane is flying.");
	}

	@Override
	void move() {
		System.out.println("Airplane is moving on the runway.");
	}
	
}
public class AbstractIntefaceExample {

	public static void main(String[] args) {
		Car1 car = new Car1();
		Airplane  airplane  = new Airplane ();
		car.start();
		car.move();
		airplane.move();
		airplane.fly();
		
		
	}

}
