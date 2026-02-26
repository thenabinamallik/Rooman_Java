package Inheritance;

class Bank {

	public void returnOnInvestment() {
		System.out.println("6.5%");
	}

	public static void withdraw() {
		System.out.println("Bank allows to Withdraw");
	}
}

class SBI extends Bank {

	@Override
	public void returnOnInvestment() {
		System.out.println("8.5%");
	}

//	Inheritated withdraw() method is hiding behind another withdraw()
//  It method  for prove add @Override

	public static void withdraw() {
		System.out.println("SBI allows to Withdraw");
	}
}

public class Problem {
	public static void main(String[] args) {

		SBI s = new SBI();
		s.returnOnInvestment();

		SBI.withdraw();

	}
}