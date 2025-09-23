package com.OOP.abstraction;

interface Car {
	public void start();

}

class ElectricCar implements Car {

	@Override
	public void start() {
		System.out.println("Electric Car Starts ");

	}

}

class DieselCar implements Car {

	@Override
	public void start() {
		System.out.println("Diesel Car Starts");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Car Tesla = new ElectricCar();
		Car Mahindra = new DieselCar();

		Tesla.start();
		Mahindra.start();

	}

}
