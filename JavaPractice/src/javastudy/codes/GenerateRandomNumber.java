package javastudy.codes;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {

		Random rand = new Random();

		int randomone = rand.nextInt(100);
		
		System.out.println(randomone);

		// Generate random int between 1 and 50
		int randomTwo = rand.nextInt(50) + 1;

		System.out.println(randomTwo);

	}
}
