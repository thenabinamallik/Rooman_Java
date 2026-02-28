package MethodOverloading;

class Calculator {

    // 1 parameter - int
    void add(int a) {
        int c = 10 + a;
        System.out.println("Inside int add: " + c);
    }

    // 1 parameter - float
    void add(float b) {
        float d = 10.5f + b;
        System.out.println("Inside float add: " + d);
    }

    // 1 parameter - double
    void add(double m) {
        double n = 20.5 + m;
        System.out.println("Inside double add: " + n);
    }
    

    // 2 parameters - int, int
    void add(int a, int b) {
        int c = a + b;
        System.out.println("Inside int, int add: " + c);
    }

    // 2 parameters - int, float
    void add(int a, float b) {
        float d = a + b;
        System.out.println("Inside int, float add: " + d);
    }

    // 3 parameters - int, int, float
    void add(int a, int b, float c) {
        float g = a + b + c;
        System.out.println("Inside int, int, float add: " + g);
    }

 
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5);
        calc.add(5.5f);
        calc.add(7.8);
        calc.add(3, 4);
        calc.add(3, 4.5f);
        calc.add(2, 3, 4.5f);
    }
}