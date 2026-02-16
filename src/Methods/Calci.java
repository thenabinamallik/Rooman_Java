

// ================= Type of Methods ===============

package Methods;
public class Calci {
	public static void main(String[] args) {
		Calci c = new Calci();
		c.add();
		System.out.println(c.sub());
		c.mul(12, 2);
		System.out.println(c.div(12, 3));
	}
	
	
	// 1. Takes No Inputs Gives No Output
	public void add() {
		int a = 10, b = 20;
		System.out.println("a + b inside add() = " + (a + b));
	}
	
	
	// 2. Takes No Input Gives No Output
	public int sub(){
		int a = 20, b = 10;
		return a-b;	
	}
	
	
	// 3. Takes Input Gives No OutPut
	public void mul(int num1, int num2) {
		System.out.println("The Mut of given Number is"+(num1*num2));
	}
	
	
	// 4. Takes Input Gives Output 
	public float div(float num3, float num4) {
		return (num3/num4);
	}
}