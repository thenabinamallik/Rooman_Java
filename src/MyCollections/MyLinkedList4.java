package MyCollections;

import java.util.LinkedList;

public class MyLinkedList4 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.push(1000);
		l1.push(2000);
		l1.push(3000);
		l1.push(4000);
		l1.push(5000);
		
		System.out.println(l1);
//		System.out.println(l1.pop());
		int n = l1.size()-1;
		while(n>=0) {
			int i = l1.poll();
			System.out.println(l1+" Popped "+i);
			n--;
		}
		
	}
}
