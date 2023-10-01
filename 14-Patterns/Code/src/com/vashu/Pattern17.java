package com.vashu;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);

    }
    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

//    static void pattern17(int n){
//        for (int row = 1; row < 2 * n; row++) {
//            int totalColInRow = row > n ? 2 * n - row : row;
//
//            int noOFSpaces = n - totalColInRow;
//            for (int s = 0; s < noOFSpaces; s++) {
//                System.out.print(" ");
//            }
//            // for every row, run the col
//            for (int col = 1; col < totalColInRow; col++) {
//                System.out.print(col);
//            }
//            // when one row is printed , we need to add a newline
//            System.out.println();
//        }
//    }
}
