package MyInterface;
interface Bird{
	public abstract void fly();
	public abstract void eat();	
}

class Eagle implements Bird {
	@Override
	public void fly() {
		System.out.println("Eagle flies in greater heights.");
	}
	@Override
	public void eat() {
		System.out.println("Eagle eats non-veg.");
	}
}

class GoldenEagle extends Eagle{
	public void eat() {
		System.out.println("Golden Eagle feeds on fish.");
	}
}
class SerpentEagle extends Eagle{
	public void eat() {
		System.out.println("Serpent Eagle feeds on snakes.");
	}
}

public class MyEagleImpln {
	public static void main(String[] args) {
		Eagle ge = new GoldenEagle();
		Eagle sg = new SerpentEagle();
		
		ge.eat();
		sg.eat();
	}
}
