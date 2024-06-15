package com.kedarnath;

import java.util.ArrayList;
import java.util.List;

//Lambda expressions provide a clear and concise way to represent one method interface using an expression.
public class LambdaTask14 {
	public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("Frontend");
			list.add("Backend");
			list.add("Testing");
			
			list.forEach(n->System.out.println(n));
	}
}
