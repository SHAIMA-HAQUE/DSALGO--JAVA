package com.company.lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class ReversalAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rotationFactor = sc.nextInt();
        int[] ar = {1,2,3,4,5};

        reverse(ar,0,rotationFactor-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,rotationFactor, ar.length-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }

    public static void reverse(int[] ar ,int start, int end){
        while(start < end){
            ArrayBasics.swap(ar,start,end);
            start ++;
            end --;
        }
    }
}
