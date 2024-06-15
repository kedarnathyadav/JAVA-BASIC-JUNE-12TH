package com.kedarnath;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class eTask implements Runnable{
	private String taskName;
	
	public eTask(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run(){
		System.out.println(taskName+" is running!!");
	}
	
	
}

public class ExecuterExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(new eTask("Task 1"));
		executorService.submit(new eTask("Task 2"));
		executorService.submit(new eTask("Task 3"));
		
		executorService.shutdown();
		
	}
	
}
