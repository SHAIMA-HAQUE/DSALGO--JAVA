package com.company.lecture4;

public class ConditionalStatements {
    public static void main(String[] args) {    //(String args) are parameters that can be provided through commmand line
       int a = 7;
       int b =12;
        System.out.println(a+b);
// If - else statement - value is a boolean
        if(a>12){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }

        if(b>0){
            System.out.println("Positive");
        }else if(b<0){
            System.out.println("Negative");
        }else{
            System.out.println("Not real");
        }

        int salary = 25493;
        int bonus = 0;
        if(salary < 15000){
            bonus = 1000;
        }else {
            bonus = 1500;
        }
        System.out.println(salary+bonus);
    }
}
//Primitives - are data types (these are not classes) int(4byte),char(usually 1byte),float(4byte),double(8 byte),boolean(true and false shares it's size)
//Classes are written in capital letters
//Packages in small letters
