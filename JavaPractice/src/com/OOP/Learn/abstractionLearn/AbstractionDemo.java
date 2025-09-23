package com.OOP.Learn.abstractionLearn;

abstract class car {

	abstract public void fueltype();

	public void color() {
		System.out.println("Black color");
	}

}

class Tata extends car {

	@Override
	public void fueltype() {
		System.out.println("Diesel");

	}

}

/*
 Important Points about Abstraction in Java:

1️ Abstraction allows you to hide implementation details and show only essential features by using abstract classes or interfaces.

2️ An abstract class can have both abstract methods (without body) and concrete methods (with body), like `fueltype()` and `color()` here.

3️ Any class that extends an abstract class must implement all its abstract methods, unless the subclass is also declared abstract.
*/
public class AbstractionDemo {
	public static void main(String[] args) {
		
		
		Tata nexon = new Tata();
		nexon.fueltype();
		nexon.color();
		
	}
}
