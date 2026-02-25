package Inheritance;

public class Multiple {
	public static void main(String[] args) {

//		MyChild2 child = new MyChild2();

	}
}

class Daddy {
	public void write() {

		System.out.println("Daddy is Writing");
	};
}

class Mommy {
	public void write() {
		System.out.println("Mommy is Writing");
	};
}

  
//  class MyChild2 extends Daddy, Mommy { }// its not possible
//Java does not support multiple inheritance through classes its results in ambiguity.
 