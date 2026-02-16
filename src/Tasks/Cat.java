package Tasks;

public class Cat {

	String name, bried;
	double cost;
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.name = "Beluga";
		cat.bried = "";
		cat.cost = 12999.90;
		
		cat.eat("fish");
		cat.sleep();
		
		
	}
	
	public void eat(String food) {
		System.out.println("Cat is eating "+food+".");
	}
	
	public void sleep() {
		System.out.println("Cat is sleeping.");
	}

}
