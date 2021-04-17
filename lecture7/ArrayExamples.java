package com.company.lecture7;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] ar = {4,5,89,9};
        System.out.println(Max(ar));
        System.out.println(maxIndex(ar));
        reverse(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static int Max(int ar[]){
        int max = ar[0];
        for(int i=1; i<ar.length ; i++){
            if (ar[i] > max){
                max = ar[i];
            }


        }
        return max;
    }

    public static int maxIndex(int ar[]){
        int max = 0;
        for(int i = 0;i<ar.length;i++){
            if(ar[i]>ar[max]){
                max =i;

            }

        }
        return max;
    }

    public static void reverse(int[] ar){
        int start = 0;
        int end = ar.length -1;
        while(start < end){
            ArrayBasics.swap(ar,start,end);
            start ++;
            end --;
        }

    }
}
