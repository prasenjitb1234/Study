package com.learn.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push("peter");
		s.push("wanda");
		s.push(10.42);
		s.push(null);
		s.push("wanda");
		s.push(90);
		s.push(100.10);
		
		
		System.out.println(s);
		System.out.println(s.size());
		
		System.out.println(s.get(3));
		
		s.pop();
		System.out.println(s);
		
		
		System.out.println( s.isEmpty()  );
		s.set(4, 90);  // update value 
		System.out.println(s);
		
		System.out.println(s.search("peter"));
		s.set(4, "Alan");
		System.out.println(s);
		
		
		
		
	}
}
