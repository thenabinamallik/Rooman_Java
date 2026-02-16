package datatypes;

public class MyShort {
	public static void main(String[] args) {
		
		short a = 32767;
//		short a = 32768; // Type mismatch: cannot convert from int to short
		short b = -32768;
//		short b = -32769; // Type mismatch: cannot convert from int to short
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(Short.MAX_VALUE); // +32767
		System.out.println(Short.MIN_VALUE); // -32768
	}
}
