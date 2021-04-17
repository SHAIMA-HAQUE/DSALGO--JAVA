package com.company.lecture7;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        swap(ar,1,4);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    //to swap any two indices
    public static void swap(int[] ar, int first , int second){
        int t = ar[first];
        ar[first] = ar[second];
        ar[second] = t;

    }
}
