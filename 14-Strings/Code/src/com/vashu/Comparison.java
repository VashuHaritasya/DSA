package com.vashu;

public class Comparison {
    public static void main(String[] args) {
        String a = "vahsu";
        String b = "vahsu";

//        System.out.println(a == b); // true

        String name1 =  new String("vashu");
        String name2 =  new String("vashu");

        System.out.println(name1 == name2); // false

        System.out.println(name2.charAt(3));

    }
}
