package MyCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("I");
		al.add("am");
		al.add("Nabina");
		al.add("Mallik");
		Iterator<String> all = al.iterator();
		while(all.hasNext()) {
			System.out.print(all.next()+" ");
		}
		System.out.println();
		ListIterator<String> lst = al.listIterator(al.size());
		while(lst.hasPrevious()) {
			System.out.print(lst.previous()+" ");
		}
	}
}
