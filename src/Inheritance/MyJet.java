package Inheritance;

class Plane {
	String className = this.getClass().getSimpleName();
	public void takeOff(){System.out.println(className + " is taking off.");}
	public void fly(){System.out.println(className + " is flying.");}
}

class Airport {
	public static void permit(Plane p) {
		p.fly();
		p.takeOff();
		System.out.println();
	}
}

class CargoPlane extends Plane {
	@Override
	public void fly(){System.out.println(super.className + " fly at lower height");}
	// Specialiesed method
	public void carryCargo(){System.out.println("Carries Cargoses");}
}

class PassengerPlane extends Plane {
	@Override
	public void fly(){System.out.println(super.className + " fly at medium hight");}
	// Specialiesed method
	public void carryPassenger(){System.out.println("Carries Passengers");}
}

class FighterPlain extends Plane {
	@Override
	public void fly(){System.out.println(super.className + " fly at greater hight");}
	// Specialiesed method
	public void carryArms(){System.out.println("Carries Arms");}
}

public class MyJet {
	public static void main(String[] args) {
//		Plane plane;
		CargoPlane c = new CargoPlane();
//		c.takeOff();
//		c.fly();
//		c.carryCargo();
//		System.out.println("\n");
		PassengerPlane p = new PassengerPlane();
//		p.takeOff();
//		p.fly();
//		p.carryPassenger();
//		System.out.println("\n");
		FighterPlain f = new FighterPlain();
//		f.takeOff();
//		f.fly();
//		f.carryArms();
//		System.out.println("\n");
//		plane = f;
//		plane.fly(); // FighterPlain fly at greater hight
////		plane.carryArms(); // The method carryArms() is undefined for the type Plane
//		((FighterPlain) plane).carryArms();
//		/*
//		 * Using the parent type reference we are unable to call specialized methods of
//		 * child class if in case we need to do it that parent type preference need to
//		 * be down casted.
//		 */
//		plane = c;
//		plane.fly(); // CargoPlane fly at lower height
//		((CargoPlane) plane).carryCargo();
//		plane = p;
//		plane.fly(); // PassengerPlane fly at medium hight
//		((PassengerPlane) plane).carryPassenger();
		
		Airport.permit(f);
		Airport.permit(p);
		Airport.permit(c);
		
	}
}

