package com.nabin.java;

public class Dog {
	String name;
	String bread;
	double price;
	
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.name = "John";
		d.bread = "Doberman";
		d.price = 12992.90;
		
		d.eat();
		d.bark();
	}
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}
}
