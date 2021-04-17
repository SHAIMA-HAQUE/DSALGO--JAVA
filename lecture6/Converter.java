package com.company.lecture6;

public class Converter {
    public static void main(String[] args) {
        System.out.println(binToDeci(1010));
        System.out.println(deciToBin(10));
        System.out.println(anyToDeci(10,10));
        System.out.println(deciToAny(10,10));
        System.out.println(anyToAny(10,10,10));
    }

    public static int binToDeci(int bin){
        int deci =0;
        int pow =1;
        while(bin>0){
            int rem = bin%10;
            deci = deci + rem*pow;
            pow = pow*2;
            bin = bin/10;
        }
        return deci;
    }
    public static int deciToBin(int deci){
        int bin =0;
        int pow=1;
        while(deci>0){
            int rem = deci%2;
            deci = deci/2;
            bin = bin + rem*pow;
            pow = pow*10;
        }
        return bin;
    }

    public static int anyToDeci(int any , int base){
        int deci =0;
        int pow = 1;

        while(any>0){
            int rem = any % 10;
            any = any/10;
            deci = deci + rem*pow;
            pow = pow*base;
        }
        return deci;
    }

    public static int deciToAny(int deci, int base){
        int any = 0;
        int pow = 1;
        while(deci>0){
            int rem = deci%base;
            deci = deci/base;
            any = any +rem*pow;
            pow = pow*10;
        }
        return any;


    }
//Make any to any method base 1 to 10
    public static int anyToAny(int any, int base1,int base2){
        int deci = anyToDeci(any , base1);
        int i = (deciToAny(deci, base2));
        return i;
    }
}
