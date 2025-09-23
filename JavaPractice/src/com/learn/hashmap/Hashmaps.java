package com.learn.hashmap;

import java.util.*;
public class Hashmaps {

	public static void main(String[] args) {
		
		// country(key) , population(value)
		HashMap<String, Integer> map = new HashMap<>();
		
		
		// insertion
		
		map.put("India", 120);
		map.put("USA", 30);
		map.put("China",150);
//		
//		System.out.println(map);
//		
//		map.put("China", 180);
//		System.out.println(map);
//		
//
//		
//		// search 
//		
//		if(map.containsKey("China")) {
//			System.out.println("Key is present in map");
//		}else {
//			System.out.println("Not present in map");
//		}
//		
//		//
//		System.out.println(map.get("China"));
//		System.out.println(map.get("Indonesia"));
		
		
//		int arr[] = {12,25,18};
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		
//		System.out.println();
//		
//		for(int val : arr) {
//			System.out.println(val + " ");
//		}
//		System.out.println();
//		
//		
		
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		

	}

}
