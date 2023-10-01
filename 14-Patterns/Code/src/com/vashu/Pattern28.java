package com.vashu;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);

    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int noOFSpaces = n - totalColInRow;
            for (int s = 0; s < noOFSpaces; s++) {
                System.out.print(" ");
            }
            // for every row, run the col
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }
    }
}
