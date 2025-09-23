package javastudy.codes;

public class SwapTwoNumbers {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		System.out.println("before swap   :  :  ");

		System.out.println(num1 + " " + num2);

		num1 = num1 + num2; // num1 = 30
		num2 = num1 - num2; // num2 = 10
		num1 = num1 - num2; // num1 = 20

		System.out.println("after swap   :  :  ");

		System.out.println(num1 + " " + num2);

	}
}
