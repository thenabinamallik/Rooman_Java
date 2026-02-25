package Inheritance;

public class MultiLevel {
    public static void main(String[] args) {

        MyChild1 child = new MyChild1();

        child.grandWrite();   // from GrandParent
        child.parentWrite();  // from Parent
        child.childWrite();   // from Child
    }
}

class MyGrandParent {
    public void grandWrite() {
        System.out.println("Grandparent is writing");
    }
}

class MyParents1 extends MyGrandParent {
    public void parentWrite() {
        System.out.println("Parent is writing");
    }
}

class MyChild1 extends MyParents1 {
    public void childWrite() {
        System.out.println("Child is writing");
    }

	public void grandWrite() {
		// TODO Auto-generated method stub
		
	}
}