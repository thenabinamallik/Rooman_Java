package assignment;

public class Car {
	String brand;
	double cost;
	public static void main(String[] args) {
		Car c = new Car();
		c.brand="BMW";
		c.cost=25000000.66;
		Car b;
		b=c;
		System.out.println(c.brand); 
		System.out.println(c.cost); 
		System.out.println(b.brand); 
		System.out.println(c.cost); 
		b.brand="Nano;";
		b.cost=250000.00;
		System.out.println(c.brand);
		System.out.println(c.cost);
		
	}
}
