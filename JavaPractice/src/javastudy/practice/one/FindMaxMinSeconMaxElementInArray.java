package javastudy.practice.one;

public class FindMaxMinSeconMaxElementInArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int max = arr[0];
		int min = arr[0];
		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("max ele is : " + max);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}

		System.out.println("secondMax is : " + secondMax);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}

		System.out.println("min ele is : " + min);

	}
}
