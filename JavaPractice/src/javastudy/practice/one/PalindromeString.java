package javastudy.practice.one;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to check palindrome : ");
		String str = sc.nextLine();
		
		int len = str.length();
		
		String org_str = str;
		
		String rev = "";
		
		for(int i = len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is palidrome");
		}
		else {
			System.out.println(org_str+" is not a palindrome ");
		}
	}
}
