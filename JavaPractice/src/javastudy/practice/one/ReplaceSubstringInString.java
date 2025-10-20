package javastudy.practice.one;

import java.util.Scanner;

public class ReplaceSubstringInString {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string  : ");
		String s1 = sc.nextLine();
		
		System.out.println("enter a substring to replace : ");
		String oldstring = sc.nextLine();
		
		System.out.println("enter new substring : ");
		String newString = sc.nextLine();
		
		String replaceString = s1.replace(oldstring, newString);
		
		System.out.println("New replaced string is : "+replaceString);
		
		
		
		
	}
}
