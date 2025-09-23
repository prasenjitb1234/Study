package com.java8_Features.FunctionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		Consumer<String> greet = name -> System.out.println("Hello, "+name);
		
		greet.accept("Prasenjit");
		
		
		
	}
}
