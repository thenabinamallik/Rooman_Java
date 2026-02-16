package datatypes;
public class TypeCasting {
	public static void main(String[] args) {
//		byte a = +127;
//		double b = a;		
//		double a = 3233;
//		byte b = (byte) a; // Type mismatch: cannot convert from double to byte
//		byte a = 125;
//		a =125+1; // 126
//		a = (byte) (a+1); // 126
//		a = a++; // 125
//		a++; // 126
//		a+=1; // 126	
		
		byte a = 127;
//		a = (byte) (a+1);
		a = (byte) (a + 5);
		
		
		System.out.println(a);
	}
}
