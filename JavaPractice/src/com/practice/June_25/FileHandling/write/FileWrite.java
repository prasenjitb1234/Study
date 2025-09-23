package com.practice.June_25.FileHandling.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		
		try {
			
			FileWriter f = new FileWriter("D:\\file_handling_java\\f4.txt");
			
			try {
				f.write("INDIA is my country ");
			}
			finally {
				f.close();
				
			}
			System.out.println("Successfully Wrote in A File !!");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
