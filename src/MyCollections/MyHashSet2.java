package MyCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyHashSet2 {
	static class Student{
		 String name;

		public Student(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("Nabin"));
		hs.add(new Student("Aman"));
		hs.add(new Student("Bishnu"));
		hs.add(new Student("Chinamay"));
		hs.add(new Student("Omm"));
		
		System.out.println(hs);
		
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		
		lhs.add(new Student("Nabin"));
		lhs.add(new Student("Aman"));
		lhs.add(new Student("Bishnu"));
		lhs.add(new Student("Chinamay"));
		lhs.add(new Student("Omm"));
		
		System.out.println(lhs);
		
//		TreeSet<Student> ths = new TreeSet<>();
//		
//		ths.add(new Student("Nabin"));
//		ths.add(new Student("Aman"));
//		ths.add(new Student("Bishnu"));
//		ths.add(new Student("Chinamay"));
//		ths.add(new Student("Omm"));
//		
//		System.out.println(ths);
		
		
		
	}
}
