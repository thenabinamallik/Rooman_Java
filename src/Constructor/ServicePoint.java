package Constructor;

public class ServicePoint {
	public static void main(String[] args) {
		Bike b = new Bike("Bullet");
		System.out.println(b.getMileage());	
		System.out.println(b.getModel());	
		System.out.println(b.getName());	
	}

}

class Bike {

	private String name;
	private double mileage;
	private int model;

	public Bike() {
		this(2025);
		System.out.println("Inside default constructor");

	}

	public Bike(String name) {
		this();
		this.name = name;
		System.out.println("Inside name constructor");

	}

	public Bike(double mileage) {
		this.mileage = mileage;
		System.out.println("Inside mileadge constructor");
	}

	public Bike(int model) {
		this(30.0);
		this.model = model;
		System.out.println("inside model constructor");
	}

	String getName() {
		return name;
		
	}

	double getMileage() {
		return mileage;
	}

	int getModel() {
		return model;
	}

}