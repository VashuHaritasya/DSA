package com.vashu;

public class MaxQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 545,345, 53};
        System.out.println(maxRange(arr, 1, 3));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal =  arr[i];
            }
        }
        return maxVal;
    }
}
