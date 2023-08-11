package com.vashu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take a input of 2 number and print the sum
        Scanner in = new Scanner(System.in);
//        int num1, num2, sum;


        System.out.println("enter the 1st number");
        int num1 = in.nextInt();
        System.out.println("enter the 2nd number ");
        int num2 = in.nextInt();
        int sum = num1 +  num2;

        System.out.println(sum);

    }
}