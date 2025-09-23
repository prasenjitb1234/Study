package com.practice.June_25.FileHandling.create;

import java.io.File;

public class CreateAFile {
	public static void main(String[] args) {

		File f = new File("D:\\file_handling_java\\f4.txt");

		try {
			if (f.createNewFile()) {
				System.out.println("File Created Successfully ! ");
			} else {
				System.out.println("File Already Exist !! ");
			}
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

	}
}
