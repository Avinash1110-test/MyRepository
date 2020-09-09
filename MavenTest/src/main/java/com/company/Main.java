package com.company;

public class Main {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        System.out.println("Avinash" + " " + class2.add(10 , 10));
        System.out.println("Avi" + " " + class2.mult(10 , 10));
        Class3 class3 = new Class3();
        class3.method1("Avinash" , "Akkera");
        Class1 class1 = new Class1();
        System.out.println(class1.class1M1(false , 100 , 200));
    }
}

