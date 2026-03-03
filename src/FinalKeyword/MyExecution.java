package FinalKeyword;

//final class Myfinal { // final class cant be extended...

class Myfinal {
	public void nonfinal() {
		System.out.println("Inside Nonfinal methods");
	}

	public final void m1() { // can get inheritate but can't overriden
		System.out.println("m1() is a final method cant be overriden.");
	}
	
//	public abstract final void name();
	
	/* Abstract -> Complesory Override. 
	 * Final -> Can't be Overriden. */
}

class Mychild extends Myfinal {
	@Override
	public void nonfinal() {
		System.out.println("Overiding nonfinal in child class");
	}
//	@Override
//	public void m1() {  // throughs errors : its unable to override bzc of the final and final cant be overriden
//		System.out.println("m1 overriden");
//	}

}

public class MyExecution {
	public static void main(String[] args) {
//		Mychild c = new Mychild();
//		c.nonfinal();
//		c.m1();

		final double A = 100.01;
		System.out.println(A);
//		A = 100.09; // The final local variable can't be re-assign.
//		System.out.println(A);
		
		System.out.println(Math.PI);

	}
}