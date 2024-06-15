package com.kedarnath;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumTask implements Callable<Integer>{

	private int a;
	private int b;
	
	public SumTask(int a, int b) {
		this.a = a;
		this.b =b;
		
	}
	@Override
	public Integer call() throws Exception {
		return a+b;
	}
	
}

public class CallableandFuture {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> future1 = executorService.submit(new SumTask(1, 2));
		Future<Integer> future2 = executorService.submit(new SumTask(1, 3));
		try {
			System.out.println("Result of future1 = "+future1.get());
			System.out.println("Result of future2 = "+future2.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}
