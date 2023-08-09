package com.vashu;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        int num =(int)(67.89f);
//        System.out.println(num);
//
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a *  b) / c;
//        System.out.println(d);

//        int number = "S";
//        System.out.println();

        byte b = 40;
        char c = 's';
        short s = 1000;
        int i = 2;
        float f = 10.00f;
        double d = 0.111;
        double result = (f * b) + (i / c) + (d - s);
        System.out.println((f * b)+" " +(i / c)+" "+ (d - s));
        System.out.println(result);



    }
}
