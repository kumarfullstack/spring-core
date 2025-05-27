package com.constructor.di;

public class Addition {
    private int a;
    private int b;
    public Addition(double a, double b) {
        System.out.println("Addition (double, double) type constructor  called");
        this.a = (int)a;
        this.b = (int)b;
    }
    public Addition(int a, int b) {
        System.out.println("Addition (int, int) type constructor  called");
        this.a = a;
        this.b = b;
    }
    public Addition(String a, String b) {
        System.out.println("Addition (String, String) type constructor  called");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);;
    }

    public  void sum() {
        System.out.println("Addition :" + (a+b));
    }
}
