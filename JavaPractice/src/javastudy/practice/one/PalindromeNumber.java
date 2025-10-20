package javastudy.practice.one;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		// wap to check if its palidrome

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check palindrome : ");
		int num = sc.nextInt();

		int rev = 0;

		int org_num = num;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {

			System.out.print(org_num + " is palindrome");
		} else {
			System.out.println(org_num + " is not palindrome ");
		}

	}
}
