package loops;

public class MyFor {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hello World! using increament " + i);
//		}
//
//		for (int i = 5; i >= 1; i--) {
//			System.out.println("Hello World using decreament");
//		}
		
		for(int i=0, j=0;i<=5 && j<=5; i++, j++) {
			System.out.println("Value of i = "+i+" :: "+"Value of j = "+j);
		}
		
	}
}
