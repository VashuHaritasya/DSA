//package com.vashu;
//
//import java.util.Arrays;
//
//public class SearchIn2DArrays {
//    public static void main(String[] args) {
//        int[][] arr = new int[][]{
//                {23, 4, 2},
//                {18, 12, 3, 9},
//                {76, 24, 22, 55},
//                {18, 126}
//        };
//        int target = 126;
//        int[] ans = max(arr, target); // format of return value {row col}
//        System.out.println(Arrays.toString(ans));
//
////        System.out.println(max(arr));
//    }
//
//    static int[] max(int[][] arr, int target) {
//        int max =  Integer.MIN_VALUE;
//        for (int[] ints : arr) {
//            for (int element : ints) {
////                if (arr[row][col] == target)
//                if (element == max) {
////                    return new int[]{row, col};
//                    max = element;
//                }
//            }
//        }
////        return new int[]{-1, -1};
////        return max;
//    }
//}
