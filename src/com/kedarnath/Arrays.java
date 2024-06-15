package com.kedarnath;

public class Arrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		a[2] = 100;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("The value at Index "+i+" = "+a[i]);
		}
		
//		for(int b: a) {
//			System.out.println(b);
//		}
	}
}
