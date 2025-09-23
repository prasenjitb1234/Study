package com.learn.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {

		// insertion & sorting order is not followed

		HashMap<Integer, String> hm = new HashMap();

		hm.put(101, "prasenjit");
		hm.put(102, "rahul");
		hm.put(103, "shahrukh");
		hm.put(104, "salman");
		hm.put(null, "laxman");
		hm.put(105, "ram");
		hm.put(106, "arav");

		System.out.println(hm);

		System.out.println(hm.containsKey(104));
		System.out.println(hm.isEmpty());
		
		hm.replace(null, "Aaryan");
		System.out.println(hm);
		
		
		System.out.println(hm.size());
		
		// use this to get individual
		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}
}
