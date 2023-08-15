package com.vashu;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {23, 2, 1, 3, 9 ,54, 34, 356, -1, -4, -8};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1 , 4));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        //run fo loop
        for (int index = 0; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
