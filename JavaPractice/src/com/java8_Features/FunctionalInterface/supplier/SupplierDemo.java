package com.java8_Features.FunctionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		
		Supplier<String> giveName = () -> "I am Java";
		
		System.out.println(giveName.get());
		
		
		
	}
}
