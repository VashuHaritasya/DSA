package com.vashu;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];  // or

//        int[][] arr2D = {
//                {1, 2, 3}, //0th index
//                {4, 5, }, //1st index
//                {6, 7, 8, 9} //2nd index
//        };
        int [][] arr = new int[3][3];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //OutPut
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // or

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }



    }
}
