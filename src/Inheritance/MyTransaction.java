package Inheritance;

class CreditCard {
	public void creditLimit() {
		System.out.println("Credit limit upto 5000");
	}
}

class AxixCard extends CreditCard{
	@Override
	public void creditLimit() {
		System.out.println("Inside Axis Card credit limit()");
	}
}

public class MyTransaction {
	public static void main(String[] args) {
		AxixCard a =new AxixCard();
		a.creditLimit();
	}
}