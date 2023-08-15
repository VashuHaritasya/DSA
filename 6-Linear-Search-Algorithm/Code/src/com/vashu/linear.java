package com.vashu;
public class linear {
    public static void main(String[] args) {
        int[] nums = {23, 2, 1, 3, 9 ,54, 34, 356, -1, -4, -8};
        int target = 20;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search the target and return the index
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run fo loop
        for (int element : arr) {
//            int element =  arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }

    // search the target and return the ture or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        //run fo loop
        for (int element : arr) {
//            int element =  arr[index];
            if (element == target){
                return true;
            }
        }
        return false;
    }

    //search in the array: return the index if the item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run fo loop
        for (int index = 0; index < arr.length; index++) {
            int element =  arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
