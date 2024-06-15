package com.kedarnath;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> a = new ConcurrentHashMap<String, Integer>();
		
		a.put("java developer", 1);
		a.put("java backend developer", 2);
		a.put("java full stack developer", 3);
		
		a.forEach((key,value)->System.out.println(key+" : "+value));
		
		// Example of concurrent modification
        new Thread(() -> {
            a.put("D", 4);
            System.out.println("Thread 1 added D");
        }).start();

        new Thread(() -> {
            a.put("E", 5);
            System.out.println("Thread 2 added E");
        }).start();
        
        a.forEach((key,value)->System.out.println(key+" : "+value));
	}
}
