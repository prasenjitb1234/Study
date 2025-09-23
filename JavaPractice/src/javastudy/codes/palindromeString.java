package javastudy.codes;

import java.util.Scanner;

public class palindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to check palindrome : ");
		String str = sc.nextLine();
		
		String rev = "";
		
		int len = str.length();
		
		String org_str = str;
		
		for(int i = len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is a palindrome !");
		}
		else {
			System.out.println(org_str+" is NOT a palindrome !");
		}
		
		
		
	}
}
