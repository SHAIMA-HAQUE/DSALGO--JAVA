package com.company.lecture6;

public class Swap {
    public static void main(String[] args) {
        int a = 4,b=5;
        swap(a,b);
        //System.out.println(a + " " + b);
    }

    public static void swap(int a,int b){
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a + " " +b);
    }
}
