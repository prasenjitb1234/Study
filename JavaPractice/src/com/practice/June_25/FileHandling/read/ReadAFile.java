package com.practice.June_25.FileHandling.read;

import java.io.FileReader;

public class ReadAFile {
	public static void main(String[] args) {

		try {

			FileReader r = new FileReader("D:\\file_handling_java\\f2.txt");

			try {

				int i;
				while ((i = r.read()) != -1) {
					System.out.print((char) i); // typecasting char
				}

			} finally {
				r.close();
			}

		} catch (Exception e) {
			System.out.println("Exception Handled " + e);
		}

	}
}
