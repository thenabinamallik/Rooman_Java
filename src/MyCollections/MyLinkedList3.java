package MyCollections;

import java.util.LinkedList;

public class MyLinkedList3 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
//		System.out.println(l1.getFirst());
//		System.out.println(l1.peekFirst());
		
		l1.add(1000);
		l1.add(2000);
		l1.add(3000);
		l1.add(4000);
		l1.add(5000);
		l1.add(6000);
		
		for(int i =0; i<l1.size();i++) {
			System.out.println(l1.get(i));
			l1.remove(Integer.valueOf(2000));
		}
		
//		System.out.println(l1);
	}
}
