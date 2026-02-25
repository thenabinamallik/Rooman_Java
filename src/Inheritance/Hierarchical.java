package Inheritance;

public class Hierarchical {
    public static void main(String[] args) {  	
    	Son1 son1 = new Son1();
    	son1.properies();
    	Son2 son2 = new Son2();
    	son2.properies();
    	Son3 son3 = new Son3();
    	son3.properies();
    	
    }
}

class Dad {
    public void properies() {
        System.out.println(this.getClass().getName().toString().substring(12)+" can inherit his Dad's Properties.");
    }
}

class Son1 extends Dad {}
class Son2 extends Dad {}
class Son3 extends Dad {}