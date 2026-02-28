package Abstraction;

public class MyAbs {
	public static void main(String[] args) {
		
		Plane p=new Plane();
		p.takeoff();
		
	
		CargoPlane cp = new CargoPlane();
		cp.fly();
		
		PassengerPlane pp =  new PassengerPlane();
		pp.fly();
	}
}

abstract class Plane {
	String cn = this.getClass().getSimpleName();

	abstract void takeoff();
	abstract void fly();
}

class CargoPlane extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at lower height");
	}
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
}

class PassengerPlane extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at medium hight");
	}
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
}

class FighterPlain extends Plane {
	@Override
	public void fly() {
		System.out.println(cn + " fly at greater hight");
	}
	public void takeoff() {
		System.out.println(cn + " is takingoff.");
	}
}
