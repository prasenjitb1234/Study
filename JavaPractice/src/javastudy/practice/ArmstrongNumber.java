package javastudy.practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		// wap to check armstrong number 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int org_num = num;
		
		while(num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		
		if(org_num == sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not armstrong");
			
			
			
			
		}
		
	}
}
