package datatypes;

public class MyByte {
	public static void main(String[] args) {

		byte a = 127; 
//      byte a = 128 // Type mismatch: cannot convert from int to byte
		byte b = -128; 
//      byte b = -129 // Type mismatch: cannot convert from int to byte

		System.out.println(a); // +127
		System.out.println(b); // -128

		System.out.println(Byte.MAX_VALUE); // +127
		System.out.println(Byte.MIN_VALUE); // -128

//      Byte, Short, Interger and Long are wrapper classes are used in collection to convert primitive to object
//	    when using static and final will create a single copy constat variable

	}
}
