package Tasks;

interface Atm {
	public static final int a = 0;
	public void withdraw();
	public abstract void deposite();
	
}

class SBI implements Atm {
	@Override
	public void withdraw() {
		System.out.println(this.getClass().getSimpleName() + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(this.getClass().getSimpleName() + " bank has the deposite functionality");
	}
}

class CANARA implements Atm {
	@Override
	public void withdraw() {
		System.out.println(this.getClass().getSimpleName() + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(this.getClass().getSimpleName() + " bank has the deposite functionality");
	}
}

class AXIS implements Atm {
	@Override
	public void withdraw() {
		System.out.println(this.getClass().getSimpleName() + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(this.getClass().getSimpleName() + " bank has the deposite functionality");
	}
}

class PlutonMall{
	public static void getInstalled(Atm a) {
		a.withdraw();
		a.deposite();
	}
}

public class MyBank {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposite();
		sbi.withdraw();
		System.out.println();
		CANARA canara = new CANARA();
		canara.deposite();
		canara.withdraw();
		System.out.println();
		AXIS axis = new AXIS();
		axis.deposite();
		axis.withdraw();
		System.out.println();
		PlutonMall.getInstalled(sbi);
		PlutonMall.getInstalled(axis); 
		PlutonMall.getInstalled(canara); 
		
		
//		Atm atm = new Atm(); // Object can't be created of Interface 
	}
}
