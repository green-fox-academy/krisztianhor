package com.company;

public class VariableMutation {
    public static void main(String[] args) {

    int a = 3;
    a += 8;
    System.out.println(a);


    int b = 100;
    b -= 7;
    System.out.println(b);


    int c = 44;
    c *= 2;
    System.out.println(c);


    int d = 125;
    d /= 5;
    System.out.println(d);


    int e = 8;
    e *= 8 * 8;
    System.out.println(e);


    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    boolean f = f1 > f2;
    System.out.println(f);


    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    boolean g = g1 < 2 * g2;
    System.out.println(g);


    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    boolean i = (i1 > i2 * i2);
    System.out.println(i);






    }



}
