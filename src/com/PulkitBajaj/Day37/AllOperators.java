package com.PulkitBajaj.Day37;

public class AllOperators {
    public static void main(String[] args) {
        int a=5,b=15;
        //assignment
        a+=b;
        System.out.println(a);
        //relational
        System.out.println(a<b);
        //logical
        System.out.println(a<10&&b>10);
        //ternary
        int c = (a>b)?a:b;
        System.out.println(c);
    }
}
