package com.company.lecture5;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //Integer Input
        System.out.println("Input : " + a);
        char ch = sc.next().charAt(0); //Character Input . s.next() takes a string. charAt(0) means it takes the first character of the String. charAt() method belongs to String Class
        System.out.println("Char : "+ch);
        String str = sc.next(); // takes a token input . A token is separated by a space, next line etc.
        System.out.println("String : "+str);
        sc.nextLine();// to avoid the next line from getting ignored.
        String line = sc.nextLine();//takes a whole line as an input until and unless the line terminates, i.e, it encounters a next line character
        System.out.println("Line : "+line);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n);
    }
}
