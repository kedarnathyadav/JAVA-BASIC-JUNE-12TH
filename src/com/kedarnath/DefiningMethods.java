package com.kedarnath;

public class DefiningMethods {
	public static void main(String[] args) {
		
		float a = 10;
		float b = 2;
		System.out.println("Sum = "+sum(a,b));
		System.out.println("subtract = "+subtract(a,b));
		System.out.println("multiply = "+multiply(a,b));
		System.out.println("divide = "+divide(a,b));
	}

	public static float sum(float a, float b) {
		return a + b;
	}

	public static float subtract(float a, float b) {
		return a - b;
	}

	public static float multiply(float a, float b) {
		return a * b;
	}
	public static float divide(float a, float b) {
		return a / b;
	}
}
