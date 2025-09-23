package com.method;

public class itSelf {
	public static void main(String[] args) {
		itSelf r = new itSelf();
		int a = r.sum(10); // calling
		System.out.println("sum of first N natural Number : "+a);
		
	}
	int sum(int b) {
		if(b > 0) {
			return b + sum(b - 1); // calling
		}
		else {
			return 0;
		}
	}
}
