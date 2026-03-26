package MyCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(30);
		ll.add(70);
		ll.add(80);
		System.out.println(ll);
		System.out.println();
		Iterator<Integer> ill = ll.iterator();
		while(ill.hasNext()) {
			System.out.print(ill.next()+" ");
		}
		
		System.out.println();
		ListIterator<Integer> lill = ll.listIterator(ll.size());
		while(lill.hasPrevious()) {
			System.out.print(lill.previous()+" ");
		}
		
		System.out.println();
		for(Integer i: ll) {
			System.out.print(i+" ");
		}
	}
}
