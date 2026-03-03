package Tasks;

interface Atm {
	public static final int a = 0;
	public void withdraw();
	public abstract void deposite();
	
}

class SBI implements Atm {
	
	String cn = this.getClass().getSimpleName();
	@Override
	public void withdraw() {
		System.out.println(cn + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(cn + " bank has the deposite functionality");
	}
	
	public void specialROI() {
		System.out.println(cn +" offers 8.5% ROI");
	}
}

class CANARA implements Atm {
	String cn = this.getClass().getSimpleName();
	@Override
	public void withdraw() {
		System.out.println(cn + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(cn + " bank has the deposite functionality");
	}
}

class AXIS implements Atm {
	String cn = this.getClass().getSimpleName();
	@Override
	public void withdraw() {
		System.out.println(cn + " bank has the withdraw functionality");
	}
	@Override
	public void deposite() {
		System.out.println(cn + " bank has the deposite functionality");
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
		sbi.specialROI();
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
