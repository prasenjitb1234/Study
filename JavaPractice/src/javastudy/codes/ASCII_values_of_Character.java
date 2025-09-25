package javastudy.codes;

import java.util.Scanner;

public class ASCII_values_of_Character {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);

		// typecasting character to integer
		int i = c;

		System.out.println("ASCII value of " + c + " is " + i);

	}
}
