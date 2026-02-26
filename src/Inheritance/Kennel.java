package Inheritance;

public class Kennel {
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.bark();
		System.out.println(p.name);
	}
}

class Dog{
	String name;
	int cost;
	
	public Dog(String name, int cost) {
		this.name = name;
		this.cost = cost;
		System.out.println("This is Dog(String, Int)");
	}
	
	public Dog(String name) {
//		super(); // both super and this cant be inside in a same constructor.
		this("Hud",2000);
		this.name = name;
		System.out.println("This is Dog(String)");
	}

	public Dog(int cost) {
		this("Ruby");
		this.cost = cost;
		System.out.println("This is Dog(Int)");
	}
	
	public Dog() {
		this(1000);
		System.out.println("This is Dog()");
	}

	public void bark() {
		System.out.println(this.getClass().getName().replace("Inheritance.", "")+" is Barking");
	}
}

class Puppy extends Dog{

	public Puppy() {
		super();
	}
	
	@Override
	public void bark() {
		System.out.println("Puppy Barks in low Voice");
	}

}
