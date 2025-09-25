package javastudy.practice;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("before swap : "+num1+" "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("AFter swap : "+num1+" "+num2);
		
		
	}
}
