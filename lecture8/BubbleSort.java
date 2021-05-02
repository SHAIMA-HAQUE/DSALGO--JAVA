package com.company.lecture8;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort();
    }
    public static void bubbleSort(){
        int[] ar = {5,3,2,4,1};
        int n = ar.length;
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            // taking only till n-1 because we are comparing and we need not go till the end, it will automatically come into consideration
             for(int j=0;j<n-i-1;j++){
                 swap = true;
                 if(ar[j]>ar[j+1]){ // Checking between two consecutive numbers in an array.
                     int temp = ar[j];
                     ar[j] = ar[j+1];
                     ar[j+1]= temp;
                 }
             }
             if(swap == false){
                 break;
             }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }

}
