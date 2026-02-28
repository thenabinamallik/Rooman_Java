package Inheritance;

public class Problem2 {
	public static void main(String[] args) {
		
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		CANARA c = new CANARA();
		
		ATM.deposite(i);
		ATM.deposite(a);
		ATM.deposite(c);
		System.out.println();
		
		ATM.withdraw(i);
		ATM.withdraw(a);
		ATM.withdraw(c);
		System.out.println();
		
		ATM.checkBalance(i);
		ATM.checkBalance(a);
		ATM.checkBalance(c);
	}
}

class RBI{}

class ATM {
	public static void deposite(RBI rbi) {System.out.println(rbi.getClass().getSimpleName()+ " is allowed to deposite");}
	public static void withdraw(RBI rbi) {System.out.println(rbi.getClass().getSimpleName()+ " is allowed to withdraw");}
	public static void checkBalance(RBI rbi) {System.out.println(rbi.getClass().getSimpleName()+ " is allowed to check balance");}
}

class ICICI extends RBI{}
class AXIS extends RBI{}
class CANARA extends RBI{}
