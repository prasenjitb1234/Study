package javastudy.codes;

import java.util.Scanner;

public class ReplaceSubstring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		System.out.println("Enter substring to replace : ");
		String oldsub = sc.nextLine();

		System.out.println("Enter new substring : ");
		String newsub = sc.nextLine();

		String newString = str.replaceAll(oldsub, newsub);

		System.out.println("new substring is : " + newString);

	}
}
