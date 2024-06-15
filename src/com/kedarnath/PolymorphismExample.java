package com.kedarnath;
//Polymorphism allows methods to do different things based on the object it is acting upon.
class Shape {
	void draw() {
		System.out.println("Drawing a shape.");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing a square");
	}
}
public class PolymorphismExample {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape square = new Square();
		
		circle.draw();
		square.draw();
	}
}
