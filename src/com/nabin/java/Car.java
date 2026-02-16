package com.nabin.java;

public class Car {
	String model;
	String brand;
	double price;

	public static void main(String[] args) {
		Car c = new Car();

		c.model = "m4";
		c.brand = "B M W";
		c.price = 12432512.34;

		c.ignite();
		c.acclerate();
		c.drift();
	}

	public void ignite() {
		System.out.println("Car ignited..");
	}

	public void acclerate() {
		System.out.println("Car acclerated..");
	}

	public void drift() {
		System.out.println("Car drifted..");
	}
}
