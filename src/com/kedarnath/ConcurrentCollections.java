package com.kedarnath;

import java.util.concurrent.ConcurrentHashMap;

//Concurrent collections are thread-safe and
//can be used in multi-threaded environments.
public class ConcurrentCollections {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> a = new ConcurrentHashMap<Integer, String>();
		a.put(1, "king");
		a.put(2, "queen");
		a.put(3, "mantri");
		
		a.forEach((key,value)->System.out.println(key+" : "+value));
	}

}
