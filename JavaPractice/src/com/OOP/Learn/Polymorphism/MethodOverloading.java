package com.OOP.Learn.Polymorphism;

public class MethodOverloading {
	// 1️. Method overloading allows multiple methods with the same name but
	// different parameters.
	// 2️. The methods must differ by the number or type (or both) of parameters —
	// not just return type
	// 3️. Overloaded methods can also use different parameter data types (e.g., int
	// vs String).

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static String sum(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {

		System.out.println(sum(5, 7));
		System.out.println(sum(5, 7, 8));
		System.out.println(sum("Indian", "Programmer"));

	}
}
