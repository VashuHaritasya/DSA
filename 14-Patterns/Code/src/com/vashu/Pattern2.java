package com.vashu;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);

    }
    static void pattern2(int n){
        for (int row = 0; row <= n; row++) {
            // for every row, run the col
            for (int col = 0; col <= row ; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
