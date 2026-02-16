package datatypes;

public class MyInt {
	public static void main(String[] args) {
		
		int a = 2147483647;
//		int a = 2147483648; // 	The literal 2147483648 of type int is out of range 
		
		int b = -2147483648;
//		int b = -2147483649; // 	The literal 2147483649 of type int is out of range 

		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(Integer.MAX_VALUE); // +2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
	}
}
