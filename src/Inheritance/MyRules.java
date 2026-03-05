package Inheritance;


//Rule of Method Overriding =>
//1. Child class overriden methods should maintain the same return typer as 
// the parent method as per the primitive data type is considerd
//2. Child class overriden method has to maintain the same access modifier 
// as in the parent. If its needs to change it can increase the visibility 
// but it canot decrease.


// Scope Increase             PRIVATE                     A 
//        |                P A C K A G E                  |
//        |              P R O T E C T E D                |
//        V            P   U   B   L   I   C       Scope Decrease


class Animal{
	
}

class Lion extends Animal{
	
}

class Tiger{
	
}


class MyParent {
	
//	public int add() {
//		int a = 10, b =20;
//		System.out.println("a+b = "+(a+b));
//		return a+b;
//	}
	
	public Animal add() {
		Animal a = new Animal();
		return a;
	}
}


class MyChild2 extends MyParent{
	
//	@Override
//	public int add() {
//		int a = 100, b =200;
//		System.out.println("a+b = "+(a+b));
//		return a+b;
//	}
	@Override
	public Animal add() {
		Animal a1 = new Animal();
		return a1;
	}
	
}

public class MyRules {
	public static void main(String[] args) {
	MyChild2 n = new MyChild2();
	n.add();
	}
}







