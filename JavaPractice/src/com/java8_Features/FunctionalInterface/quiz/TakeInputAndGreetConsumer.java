package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.*;
public class TakeInputAndGreetConsumer {
	public static void main(String[] args) {
		
		Consumer<String> greet = name -> System.out.print("Hello, "+name);
		
		greet.accept("Ravi!");
	}
}
