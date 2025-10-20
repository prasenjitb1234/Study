package javastudy.practice.one;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if Armstrong : ");
		int num = sc.nextInt();
		
		int original = num;
		int sum = 0;
		
		
		
		while(num != 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num = num / 10;
		}
		
		if(sum == original) {
			System.out.println(original+" is armstrong number");
		}
		else {
			System.out.println(original+" is not armstrong number");
		}
	}
}
