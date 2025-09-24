package javastudy.codes;

import java.util.Scanner;

public class BinaryToDecimalConversion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a binary number : ");
		int binary = sc.nextInt();

		int decimal = 0; // decimal

		int n = 0; // power

		while (binary > 0) {
			int temp = binary % 10;
			decimal += temp * Math.pow(2, n);
			binary = binary / 10;
			n++;

		}
		System.out.println("Decimal number is : " + decimal);

	}
}
