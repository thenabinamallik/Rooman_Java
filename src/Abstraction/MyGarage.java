package Abstraction;

abstract class Bike {
	public abstract void ignite();

	public abstract void changeGear();

	public abstract void accelerate();

	public abstract void applyBreaks();

}

abstract class SuperBike extends Bike {

}

abstract class Hayabussa extends SuperBike {

	@Override
	public void ignite() {
		System.out.println("Hayabussa ignites");
	}

	@Override
	public void changeGear() {

		System.out.println("Hayabussa changegears");

	}
 
}

class Hayabusa extends Hayabussa{

	@Override
	public void accelerate() {
		System.out.println("Hayabusa is accelerating.");
		
	}

	@Override
	public void applyBreaks() {
		System.out.println("hayabusa is applying breaks");
	}
	
}

public class MyGarage {
	public static void main(String[] args) {
		Bike hb = new Hayabusa();
		hb.accelerate();
	}
}
