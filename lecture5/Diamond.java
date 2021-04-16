package com.company.lecture5;

public class Diamond {
    public static void main(String[] args) {
        diamond(3);
    }
    public static void diamond(int n){
        int i =0,j=0,row=0;
        while(i<2*n-1){
            int space =0;
            while(space<n-row-1){
                System.out.print(" ");
                space++;
            }
            j=0;
            while(j<2*row+1){
                System.out.print("*");
                j++;
            }
            if(i<n-1){
                row++;
            }else{
                row--;
            }
            System.out.println();
            i++;

        }
    }
}
