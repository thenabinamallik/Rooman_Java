package Abstraction;

public class MyAbs {
	public static void main(String[] args) {	
		
		CargoLoader cp = new CargoLoader();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.loadCargo();
		System.out.println();
		
		PassengerPlane pp =  new PassengerPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		System.out.println();
		
		FighterPlane fp = new FighterPlane();
		fp.takeoff();
		fp.fly();
		fp.land();
		
		;
		
	}
}


abstract class Plane {
	String cn = this.getClass().getSimpleName();
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

abstract class CargoPlane extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at lower height.");
	}
	@Override
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
	@Override
	public void land() {
		System.out.println(cn+ " is landing.");
	}
	
	abstract void loadCargo();
}

class PassengerPlane extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at medium hight.");
	}
	@Override
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
	@Override
	public void land() {
		System.out.println(cn+ " is landing.");
	}
}

class FighterPlane extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at greater hight.");
	}
	@Override
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
	@Override
	public void land() {
		System.out.println(cn+ " is landing.");
	}
}

class CargoLoader extends CargoPlane{
	
	public void loadCargo() {
		System.out.println(cn + " has the lander");
	}
}
