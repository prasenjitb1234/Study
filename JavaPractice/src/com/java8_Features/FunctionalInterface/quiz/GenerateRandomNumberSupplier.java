package com.java8_Features.FunctionalInterface.quiz;

import java.util.function.Supplier;

public class GenerateRandomNumberSupplier {
	public static void main(String[] args) {
		
		Supplier<Double> getRandomNumber = () -> Math.random();
		
		System.out.println("Random Number 1 : "+getRandomNumber.get());
		System.out.println("Random Number 2 : "+getRandomNumber.get());
		
	}
}
