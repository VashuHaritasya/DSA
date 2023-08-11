package com.vashu;

import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message =  greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    private static String mygreet(String name) {
        String message = "hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "how are u??";
        return greeting;
    }
}
