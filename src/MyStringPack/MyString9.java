package MyStringPack;

public class MyString9 {
public static void main(String[] args) {
	
	String str = "Rooman Technology Pvt Ltd";
	
	System.out.println(str.charAt(6));      // -> Space
	
	System.out.println(str.substring(6,7)); // -> Space
	
	System.out.println(str.contains("techno")); // false
	
	System.out.println(str.contains("Techno")); // true
}
}
