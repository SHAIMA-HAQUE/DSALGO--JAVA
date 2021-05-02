package com.company.lecture8;
import java.util.*;
public class InsertionSort {
    //best used in almost sorted array
    // already sorted array is used
    //insert an element in it's appropriate place in the already sorted array
    public static void main(String[] args) {
        insertionSort();

    }
    public static void insertionSort(){
        int[] ar = {5,3,4,2,1};
        for(int i = 1; i<ar.length; i++){
            //Using i=1 because we know that the first element is already sorted.
            int key = ar[i]; // storing one element
            int j = i-1; // ar[j] is the previous element
            while(j>=0 && ar[j]>key){ // if previous element is greater than the key
                ar[j+1]=ar[j];//then shift the higher value to the next position
                j = j-1;
            }
            ar[j+1]=key;//shifting the key to the next element.
        }
        for(int i =0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
