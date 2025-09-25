package javastudy.practice;

import java.util.Scanner;

public class FindASCIIvalueOfCharacter {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		
		int i = c;
		
		System.out.println("ASCII value is : "+i);
		
		
	}
}
