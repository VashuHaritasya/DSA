package com.vashu;

import java.util.Arrays;

public class SwapQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 545,345, 53};
        swap(arr, 1, 5);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
