package Inheritance;

public class Hybrid {
    public static void main(String[] args) {

        Child child = new Child();

        child.grandMethod();
        child.parentMethod();
     
    }
}

class GrandParent {
    public void grandMethod() {
        System.out.println("Grandparent method");
    }
}

class Parent extends GrandParent {
    public void parentMethod() {
        System.out.println("Parent method");
    }
}



class Child extends Parent {

 
}
