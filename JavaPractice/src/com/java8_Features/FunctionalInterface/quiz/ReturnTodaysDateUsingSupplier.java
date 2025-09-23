package com.java8_Features.FunctionalInterface.quiz;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ReturnTodaysDateUsingSupplier {
	public static void main(String[] args) {
		
		Supplier<LocalDate> currentDate = () -> LocalDate.now();
		
		System.out.println("Today's Date is : "+currentDate.get());
		
		
	}
}
