package MyCollections;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add("Rooman");
		a.add("Technology");
		
		System.out.println(a);
		System.out.println();
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println();
		for(Object o: a) {
			System.out.println(o);
		}
	}
}
