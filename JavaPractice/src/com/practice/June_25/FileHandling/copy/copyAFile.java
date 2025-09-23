package com.practice.June_25.FileHandling.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyAFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream r = new FileInputStream("D:\\file_handling_java\\f2.txt");
		FileOutputStream w = new FileOutputStream("D:\\file_handling_java\\f3.txt");
		
		int i;
		while((i = r.read()) != -1) {
			w.write((char) i);
		}
		
		System.out.println("Data Copied Successfully ! ");
		
	}
}
