package com.vashu;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -6, -2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 79, 101, 111, 118};
        int target =  76;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    // return the index
    // return -1 if it does not exist

    static int binarySearch (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <=  end){
            //find the middle element
//            int mid = (start + end) / 2;

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start =  mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
