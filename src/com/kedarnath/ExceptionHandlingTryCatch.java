package com.kedarnath;

import java.util.Scanner;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a , b, result;
		System.out.println("Division Operation: \nEnter First value: ");
		a= scan.nextInt();
		System.out.println("Enter second value");
		b = scan.nextInt();
		
		try {
			result = a / b;
			System.out.println("Result: "+result);
		} catch (ArithmeticException e) {
			System.out.println("Division is not possible!! please check the values enetered.");
			e.printStackTrace();
		}
	}

}
