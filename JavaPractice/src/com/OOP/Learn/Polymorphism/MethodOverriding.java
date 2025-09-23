package com.OOP.Learn.Polymorphism;

//1 Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass.
//2️ The overridden method must have the **same name, return type, and parameters** as in the superclass.
//3️ Overriding supports **runtime polymorphism**, where the method call is resolved at runtime based on the object type.

class Bank {

	public void RateOfInterest() {
		System.out.println("Generally rate of interest is 5 % ");
	}
}

class SBI extends Bank {
	@Override
	public void RateOfInterest() {
		System.out.println("Rate of Interet for SBI is 6.5 % ");
	}

}

class PNB extends Bank {
	@Override
	public void RateOfInterest() {
		System.out.println("Rate of Interest for PNB is 6 % ");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Bank obj = new Bank();
		obj.RateOfInterest();

		SBI obj1 = new SBI();
		obj1.RateOfInterest();

		PNB obj2 = new PNB();
		obj2.RateOfInterest();

	}
}
