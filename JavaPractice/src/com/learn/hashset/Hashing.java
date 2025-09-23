package com.learn.hashset;

import java.util.HashSet;

import java.util.Iterator;
public class Hashing {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		//insert
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		
		System.out.println("size of set is : "+ set.size());
		
		// print all elements 
		System.out.println(set);
		
		
		// search - contains
//		
//		if(set.contains(1)) {
//			System.out.println("Set contains 1");
//		}
//		
//		if(!set.contains(6)) {
//			System.out.println("does not contains");
//		}
//		
//		
//		// delete 
//		
//		set.remove(1);
//		if(!set.contains(1)) {
//			System.out.println("it does not contains 1");
//		}
//		
//		
		
		
		// Iterator
		Iterator it = set.iterator();
		
		// hasNext;   next;
		
		
		

	}

}
