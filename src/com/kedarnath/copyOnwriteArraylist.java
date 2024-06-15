package com.kedarnath;

import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnwriteArraylist {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String>  arrayList= new CopyOnWriteArrayList<String>();
		arrayList.add("java");
		arrayList.add("angular");
		arrayList.add("spring");
		for(String i: arrayList) {
			System.out.println(i);
			arrayList.add("full stack java");
		}
		System.out.println("The list after adding in the loop: "+arrayList);
	}
}
