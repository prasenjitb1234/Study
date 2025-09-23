package com.java.string;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString2 {
    
    public static boolean isAnagram(String s1, String s2){
        // Remove spaces from strings
        String str1 = s1.replaceAll("\\s","");
        String str2 = s2.replaceAll("\\s","");
        
        // Check length
        if(str1.length() != str2.length()){
            return false;
        }
        
        // Convert to lowercase char arrays
        char c1[] = str1.toLowerCase().toCharArray();
        char c2[] = str2.toLowerCase().toCharArray();
        
        // Sort arrays
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        // Check equality of sorted arrays
        return Arrays.equals(c1,c2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        
        boolean status = isAnagram(s1, s2);
        
        if(status){
            System.out.println(s1 + " and " + s2 + " are Anagram");
        } else {
            System.out.println(s1 + " and " + s2 + " are not Anagram");
        }
    }
}
