package com.company.lecture6;

import java.util.Scanner;

public class ArrayEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];//declaring an array

        System.out.println(ar[0]);
        for(int i =0;i< ar.length;i++){
            ar[i] = sc.nextInt();
        }

    }
}
