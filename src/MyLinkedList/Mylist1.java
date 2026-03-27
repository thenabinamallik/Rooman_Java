package MyLinkedList;

import java.util.LinkedList;

public class Mylist1 {
	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		ll1.add(1000);
		ll1.add(2000);
		System.out.println(ll1);
		ll1.remove(2);
//		ll1.remove(new Integer(20));
		ll1.remove(Integer.valueOf(20));
		
//		LinkedList<Integer> ll2 = new LinkedList<>();
//		ll2.add(1000);
//		ll2.add(2000);
//		ll2.add(3000);
//		ll2.add(4000);
//		ll2.add(5000);
////		ll1.addAll(3, ll2);
////		ll1.retainAll(ll2);
//		ll1.removeAll(ll2);
		System.out.println(ll1);
		
		
		
	}
}
