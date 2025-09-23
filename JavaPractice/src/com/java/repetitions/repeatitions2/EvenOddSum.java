package com.java.repetitions.repeatitions2;

public class EvenOddSum {
	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6};
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<num.length;i++) {
			if(i % 2 == 0) {
				even = even + num[i];
			}
			else {
				odd = odd + num[i];
			}
		}
		
		System.out.println("Even index position number sum:"+even);
		System.out.println("Odd index position number sum : "+odd);
	
		
		
		
		
	}
}
