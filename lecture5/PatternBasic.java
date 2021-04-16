package com.company.lecture5;

public class PatternBasic {
    public static void main(String[] args) {
        square(6);
        triangle(6);
        downTriangle(4);
        }
    public static void square(int n) {
        int i = 0, j = 0;
        while (j < n) {
            i = 0;
            while (i < n) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            j++;
        }
    }
    public static void triangle(int s){
            int row=0;
            while(row<s){
                int col =0;
                while(col<=row){
                    System.out.print("* ");
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    public static void downTriangle(int n){
        int row = 0;
        while(row<n){
            int col = 0;
            while(col<n-row){
                System.out.print("* ");
                col ++;
            }
            System.out.println();
            row++;
        }
    }

    }

