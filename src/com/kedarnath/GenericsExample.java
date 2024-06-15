package com.kedarnath;
class Box<T>{
	private T value;
	
	public void setValue(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
	
}
public class GenericsExample {
	public static void main(String[] args) {
		Box<Integer> a = new Box<Integer>();
		a.setValue(2);
		System.out.println(a.getValue());
		
		Box<String> b = new Box<String>();
		b.setValue("King");
		System.out.println(b.getValue());
		
		
	}
}
