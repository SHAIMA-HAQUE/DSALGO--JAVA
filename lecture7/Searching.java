package com.company.lecture7;

public class Searching {
    public static void main(String[] args) {
      int[] ar = {1,2,3,4};
        System.out.println(linearSearch(ar,2));
        System.out.println(binarySearch(ar, 2));

    }
    public static int linearSearch(int[] ar,int element){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] ar ,int element){ //always works on sorted array
        int start = 0;
        int end = ar.length -1;
        while(start <= end){
            // start + (end-start)/2 this avoids overflow
            int mid = (start + end)/2;
            if(ar[mid] == element){
                return mid;
            }else if(ar[mid]>element){
                end = mid -1;

            }else{
                start = mid + 1;

            }

        }
        return -1;
    }
}
