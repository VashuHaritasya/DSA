package com.vashu;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //arrays of premetives
        int[] arr =  new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 445;
        arr[3] = 545;
        arr[4] = 465;

//        System.out.println(arr[1]);
        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        for(int num: arr){
//            System.out.print(num + " "); // here num represents element of the array
//        }

        // arrays of objects

        String[] str =  new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "vashu";

        System.out.println(Arrays.toString(str));
    }
}
