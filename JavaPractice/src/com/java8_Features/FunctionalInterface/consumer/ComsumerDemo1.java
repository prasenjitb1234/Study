package com.java8_Features.FunctionalInterface.consumer;

import java.util.function.*;

public class ComsumerDemo1 {
	public static void main(String[] args) {
		
		
		
		Consumer<String> greet = name -> System.out.println("Hello "+name);
		
		greet.accept("Prasenjit");
		
	}
	
	
}
