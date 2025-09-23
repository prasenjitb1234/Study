package com.ExceptionHandling.mechanisms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisFinallyDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		finally {
			// clean up here 
			if(fis != null) {
				
				fis.close();
			}
			System.out.println("File closed");
		}
		
	}
}
