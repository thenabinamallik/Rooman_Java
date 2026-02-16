

// ================= Type of Methods ===============

package Methods;
public class Calci {
	public static void main(String[] args) {
		Calci c = new Calci();
		c.add();                             // Point 1
		System.out.println(c.sub());        //  Point 2 
		c.mul(12, 2);                      //   Point 3
		System.out.println(c.div(12, 3)); //    Point 4
	}
	
	
	// 1. Takes No Inputs Gives No Output
	public void add() {
		int a = 10, b = 20;
		System.out.println("a + b inside add() = " + (a + b));
	}
	
	
	// 2. Takes No Input Gives Output
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