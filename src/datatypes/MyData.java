package datatypes;

public class MyData {
	public static void main(String[] args) {
		int a = 45; // 45
		int b = 045; // 37 - 0 45 is Octal
		int c = 0x45; // 69 - 0x 45 is Hexadecima
		int d = 0B11000; // 24 - 0B 11000 as Binary
		
//		- Number having 0 as prefix init is consider as Octal
//		- Number having 0x as prefix init is consider as Hexadecima
//		- Number having 0B as prefix init is consider as Binary
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
