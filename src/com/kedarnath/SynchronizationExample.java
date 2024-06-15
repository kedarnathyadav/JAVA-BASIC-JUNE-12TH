package com.kedarnath;


class Counter{
	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}

class CounterTask implements Runnable{
	
	private Counter counter;
	
	public CounterTask(Counter counter) {
		this.counter=counter;
	}

	@Override
	public void run() {
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
			System.out.println(counter.getCount());
	}
	
	
}
public class SynchronizationExample {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t1 = new Thread(new CounterTask(counter));
		Thread t2 = new Thread(new CounterTask(counter));
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("Final Count = "+counter.getCount());
		
	}
}
