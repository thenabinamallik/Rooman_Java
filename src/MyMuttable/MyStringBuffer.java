package MyMuttable;

public class MyStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16
		
		sb.append("java");
		System.out.println(sb); // java
		System.out.println(sb.capacity()); // 16
		
		sb.append(" Javascript");
		System.out.println(sb); // java Javascript
		System.out.println(sb.capacity()); // 16
		
		sb.append(" Jamesgosling");
		System.out.println(sb); // java Javascript Jamesgosling
		System.out.println(sb.capacity()); // 34 
		
		// new capacity = (old capacity*2) + 2
		// => (16*2) + 2 = 34
		
		sb.trimToSize();
		System.out.println(sb.capacity()); // 28
	}
}
