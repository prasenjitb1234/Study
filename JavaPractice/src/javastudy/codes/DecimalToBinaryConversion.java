package javastudy.codes;

import java.util.Scanner;

public class DecimalToBinaryConversion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a decimal number : ");
		int decimal = sc.nextInt();

		String binary = "";

		int num = decimal;

		while (num > 0) {

			int rem = num % 2;
			binary = rem + binary;
			num = num / 2;
		}

		System.out.println("binary is : " + binary);

	}
}
