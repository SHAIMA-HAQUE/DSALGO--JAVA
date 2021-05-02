package com.company.lecture8;

public class CountingSort {
    public static void main(String[] args) {
        countingSort();
    }
    //Non comparison based sorting
    //Find the max element
    //form another array of length maxNumber+1
    //add the frequency of the numbers in the respective indices
    //then make another array which will be the cumulative frequency.
    //form the ultimate array of same length.Decide the position of the elements in accordance with cumulative array
    public static void countingSort(){
        int[] A = {1,2,5,3,2};
        int B[] = new int[A.length];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if(max<A[i]) {
                max = A[i];
            }

        }
        int C[] = new int[max+1];
        for (int i = 0; i < A.length; i++) {
            C[A[i]] = C[A[i]]+1;
        }
        for (int i = 1; i < C.length; i++) {
            C[i] = C[i] + C[i-1];

        }
        for(int i=A.length-1;i>=0;i--){
            B[C[A[i]]-1]=A[i];
            C[A[i]] = C[A[i]] -1;
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }



    }
}
