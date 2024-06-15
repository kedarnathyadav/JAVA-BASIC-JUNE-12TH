package com.kedarnath;

import java.util.concurrent.CyclicBarrier;

class Task1 extends Thread{
	private CyclicBarrier cyclicBarrier;
	
	public Task1(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" ");
	}
}

public class CyclicBarrierExample {
		
}
