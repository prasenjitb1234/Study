package javastudy.codes;

public class SumOfDigitsInNumber {
	public static void main(String[] args) {

		int num = 12345;

		int sum = 0;

		while (num > 0) {
			int digit = num % 10; // get last digit
			sum = sum + digit; // add to sum
			num = num / 10; // remove last digit
		}

		System.out.println("Sum of digits = " + sum);
	}
}
