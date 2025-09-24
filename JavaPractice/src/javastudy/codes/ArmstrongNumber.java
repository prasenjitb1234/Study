package javastudy.codes;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check armstrong or not : ");
		int num = sc.nextInt();
		
		int org_num = num;
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		
		if(sum == org_num) {
			System.out.println(org_num+" is Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number ");
		}
	}
}
