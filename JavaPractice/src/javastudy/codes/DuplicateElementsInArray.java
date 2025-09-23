package javastudy.codes;

public class DuplicateElementsInArray {
	public static void main(String[] args) {

		String arr[] = { "java", "python", "c++", "javascript", "rust", "java", "go", "python" };

		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Duplicate Element found : " + arr[i]);
					status = true;
				}
			}
		}

		if (status == false) {
			System.out.println("NO Duplicate element in array !");
		}

	}
}
