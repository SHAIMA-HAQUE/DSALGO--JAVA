package com.company.lecture6;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 =n ;
        int decimal =0, c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        for(int i=0;i<c;i++){
           int  d= n1%10;
            decimal = decimal + d*((int)Math.pow(2,i));
            n1 = n1/10;
        }
        System.out.println(decimal);
    }
}
