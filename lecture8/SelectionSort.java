package com.company.lecture8;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort();
        //is not a stable sorting algorithm
    }
    //Select one number and then choose the minimum from the rest
    // if the number is greater than minimum then swap
    // Go to next number
    public static void selectionSort(){
        int[] ar = {5,4,2,3,1};
        int n = ar.length;
        for (int i = 0; i < n-1; i++) {
            int iMin = i;
            for (int j = i+1; j <n; j++) {
                if(ar[j]<ar[iMin]){
                    iMin = j;
                }
            }
            if(iMin!=i){
                int temp = ar[iMin];
                ar[iMin]= ar[i];
                ar[i]=temp;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }

    }

}
