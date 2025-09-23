package com.java.search;

public class LinearSearch {

	public static void main(String[] args) {
		
		// elements can be of any order 
		
		
		int a[] = {10,20,40,50,30};
		
		int search_ele = 30;
		boolean flag = false;
		
		for(int i=0;i<a.length;i++) {
			if(search_ele == a[i]) { 
				System.out.println(search_ele+" Element found at "+i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found");
		}
		
		
		
		
		
		

	}

}
