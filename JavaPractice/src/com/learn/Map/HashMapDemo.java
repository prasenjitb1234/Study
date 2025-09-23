package com.learn.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// map doesn't value sorting order
		// map doesn't follow insertion value
		// there can be only 1 null key
		// there can be multiple null values

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "rahul");
		map.put(2, "aman");
		map.put(3, "Altaf");
		map.put(4, "Amir");
		map.put(null, "Kiran"); // only 1 null key
		map.put(5, null); // can have multiple null values
		map.put(6, null);

		System.out.println(map);

		System.out.println(map.containsKey(4)); // true
		System.out.println(map.containsValue("Armaan"));
		System.out.println(map.size());

		//
		//
		//

		Map m = new HashMap();

		m.put(101, "deepak");
		m.put(104, "karan");
		m.put(103, "Arnav");
		m.put(102, "ram");
		m.remove(104); // removed 104

		System.out.println(m);

		m.clear();
		System.out.println(m);

		System.out.println(map.get(4));

		System.out.println(map.isEmpty());

	}

}
