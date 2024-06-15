package com.kedarnath;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {

	private CountDownLatch latch;

	public Worker(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is working");
			Thread.sleep(1000);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " is finished");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class CountDownLatchExample {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);

		Worker w1 = new Worker(latch);
		Worker w2 = new Worker(latch);
		Worker w3 = new Worker(latch);	
		Worker w4 = new Worker(latch);

		w1.start();
		w2.start();
		w3.start();
		

		try {
			latch.await();
			System.out.println("all workers are finished");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
