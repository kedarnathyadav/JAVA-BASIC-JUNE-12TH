package com.kedarnath;


class NumberPrinter implements Runnable{
	private String threadName;
	
	public NumberPrinter(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(threadName + " - "+i);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
						e.printStackTrace();
				}
				
			}
	}
	
}
public class MultithreadingandConcurrency {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new NumberPrinter("Thread 1"));
		Thread thread2 = new Thread(new NumberPrinter("Thread 2"));
		
		thread1.start();
		thread2.start();
		
	}

}
