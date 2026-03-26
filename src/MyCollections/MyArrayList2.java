package MyCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class MyArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);		
		al.add(90);
		al.add(100);
		
		Iterator<Integer> nal = al.iterator();
		
		while(nal.hasNext()) {
			System.out.println(nal.next()+" ");
		}
		
		ListIterator<Integer> lal = al.listIterator(al.size());
//		while(lal.hasNext()) {
//			System.out.println(lal.next());
//		}
		
		while(lal.hasPrevious()) {
			System.out.println(lal.previous());
		}
	}
}
