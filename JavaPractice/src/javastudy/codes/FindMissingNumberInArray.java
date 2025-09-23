package javastudy.codes;

public class FindMissingNumberInArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int n = 10;

		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}

		int sum2 = n * (n + 1) / 2;

		System.out.println("Missing Number is : " + (sum2 - sum1));

	}
}
