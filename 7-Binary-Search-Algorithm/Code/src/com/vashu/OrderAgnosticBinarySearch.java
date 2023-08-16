package com.vashu;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-18, -6, -2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 79, 101, 111, 118};
        int[] arr = {99, 80, 56, 45, 23, 19, 14, 12, 9, 7, 5, 3, 2};
        int target =  76;
        int ans = OrderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        // find wheather the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <=  end){
            //find the middle element
//            int mid = (start + end) / 2;

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                } else  {
                    start =  mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                end = mid -1;
            } else    {
                start =  mid + 1;
            }
            }
        }
        return -1;
    }
}
