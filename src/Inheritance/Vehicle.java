package Inheritance;

public class Vehicle {
	public static void main(String[] args) {
		SuperBike sb = new SuperBike();
		sb.ride();
		sb.applyBreak();
		System.out.println("\n");
		MopedBike mb = new MopedBike();
		mb.ride();
		mb.applyBreak();
		System.out.println("\n");		
		ElectricBike eb = new ElectricBike();
		eb.ride();
		eb.applyBreak();
		System.out.println("\n");		
	}
}

class Bike{
	
	String bikename = this.getClass().getName().toString().replace("Inheritance.", "");
	
	public void ride() {
		System.out.println("Im riding a "+bikename);
	}
	public void applyBreak() {
		System.out.println("Im applying break on a "+bikename);
		
	}
}

class SuperBike extends Bike{}
class MopedBike extends Bike{}
class ElectricBike extends Bike{}
