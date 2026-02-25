package Inheritance;

public class SingleLevel {
    public static void main(String[] args) {

        MyChild child = new MyChild();
        child.write();   // inherited method

    }
}

class MyParents {
    public void write() {
        System.out.println("Parent is writing");
    }
}

class MyChild extends MyParents {

}

