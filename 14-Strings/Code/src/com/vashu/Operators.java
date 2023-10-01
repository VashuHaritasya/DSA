package com.vashu;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 2));

        System.out.println("a" + 1);

        System.out.println("vashu" + new ArrayList<>());

//        System.out.println("vashu" + new Integer(67));

        String ans =  new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
