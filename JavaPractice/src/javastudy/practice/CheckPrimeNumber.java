package javastudy.practice;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		else {
			for(int i = 2;i<=Math.sqrt(num);i++) {
				if(num % 2 != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime : ");
		int num = sc.nextInt();
		
		
		boolean prime = isPrime(num);
		
		if(prime) {
			System.out.println(num+" is prime number ");
		}
		else {
			System.out.println(num+" is not prime number");
		}
		
		
		
		
		
	}
}
