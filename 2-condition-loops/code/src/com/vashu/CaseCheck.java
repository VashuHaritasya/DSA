package com.vashu;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String word =  "hello";
        char ch = in.next().trim().charAt(0);
//        System.out.println(in.next().trim().charAt(0));
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");

        }else {
            System.out.println("UpperCase");
        }
        System.out.println(ch);
    }
}
