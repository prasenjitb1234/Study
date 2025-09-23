package com.java8_Features.FunctionalInterface.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PrintAllNamesFromListConsumer {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amit","Sneha","Pooja","Ravi");
		
		Consumer<List<String>> printNames = list -> {
			for(String name : names) {
				System.out.println(name);
			}
		};
		
		printNames.accept(names);
		
		
		
	}
}
