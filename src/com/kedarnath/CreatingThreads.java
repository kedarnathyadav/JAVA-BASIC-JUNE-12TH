package com.kedarnath;
//Threads allow concurrent execution of two or more parts of a program.

class HondaBike extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class CreatingThreads {
	public static void main(String[] args) {
		HondaBike hondaBike1 = new HondaBike();
		HondaBike hondaBike2 = new HondaBike();
		hondaBike1.start();
		hondaBike2.start();
		
	}
}
