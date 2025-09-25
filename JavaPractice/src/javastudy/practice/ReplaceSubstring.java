package javastudy.practice;

import java.util.Scanner;

public class ReplaceSubstring {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter substring to replace : ");
		String oldsub = sc.nextLine();
		
		System.out.println("Enter new substring : ");
		String newsub = sc.nextLine();
		
		String replaceString = s1.replace(oldsub, newsub);
		
		System.out.println("replaced string is : "+replaceString);
		
		
		
		
	}
}
