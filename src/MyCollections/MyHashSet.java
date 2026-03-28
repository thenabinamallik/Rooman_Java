package MyCollections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hii");
		hs.add("this");
		hs.add("is");
		hs.add("Nabina");
		hs.add("Mallik");
		hs.add(null);
		hs.add(null);
//		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
