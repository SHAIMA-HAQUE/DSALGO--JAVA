package com.company.lecture5;

public class HollowRhombus {
    public static void main(String[] args) {
        //Frame(4);
        Rhombus(5);
    }
    public static void Frame(int n){
        int row =0,col=0;
        while(row<n){
            col=0;
            while(col<n){
                if(row==0|| col==0 || row==n-1 || col==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;


        }
    }
    public static void Rhombus(int n){
        int row =0,col;
        while(row<n){
            int space =0;

            while(space<n-row){
                System.out.print(" ");
                space++;
            }
            col =0;
            while(col<n){
                if(row == 0 || col ==0 ||  row== n-1 ||col ==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                col ++;
            }
            System.out.println();
            row++;
        }
    }
}
