package datatypes;

public class MyRealNumber {
	public static void main(String[] args) {
//		System.out.println(Float.MAX_VALUE); // 3.4028235E38
//		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		
//		float height =  5.5;// Type mismatch: cannot convert from double to float
//		float height =  5.5f;
//		float height = (float) 5.5; //Down Casting
		
		float a = (float) Math.PI;
		double b = Math.PI;
		
		System.out.println(a); // 3.1415927
		System.out.println(b); // 3.141592653589793
		
		/*
		 *  if we need more precision we need to go for Double, for low precision we need
		 * to go for Float
		 */
	}
}
