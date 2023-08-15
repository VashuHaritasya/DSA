package com.vashu;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 2, 1, 3, 9 ,54, 34, 356, -1, -4, -8};
        System.out.println(min(arr));
    }
    //assume arr.length != 0
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
