package com.practice.June_25.FileHandling.rename;

import java.io.File;

public class RenameAFile {
	public static void main(String[] args) {
		
		File f = new File("D:\\file_handling_java\\f4.txt");
		File r = new File("D:\\file_handling_java\\prasen.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(r));
		}
		else {
			System.out.println("File Does not Exist ! ");
		}
		
		
	}
}
