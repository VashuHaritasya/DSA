package com.vashu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(6457);
//        list.add(6733);
//        list.add(6723);

        //update
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list.contains(67));
//        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list[index] syntax will not work
        }
        System.out.println(list);

    }
}
