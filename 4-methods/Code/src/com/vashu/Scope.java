package com.vashu;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name =  "vahsu";

        {
             a =78; // reassign the origin ref variable to some other value
            int c = 99;
            name = "rahul";
            System.out.println(name);
            //value initilaized in this block will remain in the block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);

        // scooping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 99;
             a = 1000;
        }
        System.out.println(a);

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
