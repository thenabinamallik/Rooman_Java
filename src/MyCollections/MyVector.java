package MyCollections;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(100); 
		v1.add(200);
		v1.add(400);
		
		Thread t1 = new Thread(()->{
			for(int j=0;j<=5; j++) {
				try {
					Thread.sleep(1000);
					System.out.println(j);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		System.out.println(v1);
		
		Enumeration<Integer> ev1 = v1.elements();
		
		while(ev1.hasMoreElements()) {
			System.out.println(ev1.nextElement());
		}
		
		
	}
}
