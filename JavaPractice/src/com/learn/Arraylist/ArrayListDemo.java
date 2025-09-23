package com.learn.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList l1 = new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(40);
		l1.add(null);
		l1.add("prasenjit");
		l1.add(90);
		
		System.out.println(l1);
		
		
		// iterator is used to get elements one by one 
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		****
		
		ArrayList l2 = new ArrayList();
		
		l2.add("atif");
		l2.add("aman");
		l2.add("arnav");
		l2.add("aditi");
		l2.add("aditya");
		l2.add("arbaz");
		
		System.out.println(l2);
		
		l2.remove(1);
		System.out.println(l2);
		
		System.out.println(l2.contains("arnav"));
		
		System.out.println(l2.get(3));
		
		
		
		
		

	}

}
