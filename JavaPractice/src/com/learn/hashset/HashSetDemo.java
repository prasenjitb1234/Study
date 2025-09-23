package com.learn.hashset;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		// hashset does not follow insertion order
		// hashset does not follow sorting order

		HashSet hs = new HashSet<>();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add("prasenjit");
		hs.add(50);
		hs.add(null);
		hs.add(null); // cannot store duplicate null value
		hs.add("xyz");
		hs.add(40); // cannot store duplicate elements
		hs.add(true);

		System.out.println(hs);
		System.out.println("***********" + " \n");

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
