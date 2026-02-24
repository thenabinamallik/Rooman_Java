package MyStringPack;

import java.util.Scanner;

public class MyInput1 {
	public static void main(String[] args) {
		String str = new Scanner(System.in).next(); // Method chaining
		System.out.println(str); // Nabin
		char c = str.charAt(0); 
		System.out.println(c); // N
		
		char ch = new Scanner(System.in).next().charAt(0); // Method chaining
		System.out.println(ch); // M
		
	}
}
