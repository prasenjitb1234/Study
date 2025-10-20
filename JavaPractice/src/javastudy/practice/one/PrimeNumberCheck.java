package javastudy.practice.one;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check prime or not : ");
		int num = sc.nextInt();

		boolean primeNumber = isPrime(num);

		if (primeNumber) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}

	}
}
