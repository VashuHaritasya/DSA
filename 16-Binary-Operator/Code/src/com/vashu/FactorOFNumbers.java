package com.vashu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FactorOFNumbers {
    public static void main(String[] args) {
        factors2(20);
        factors3(20);

    }
    //time complexity o(n)
    static  void factors(int n){
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

//    time complexity o(sqrt(n))
    static  void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                if (n/2 == i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " " + n/i + " ");
                }
            }
        }
    }
    //both time and space with be o(sqrt(n))
    static  void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                if (n/2 == i){
                    System.out.println(i + " ");
                }else{
                    System.out.println(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i ) + " ");
        }
    }
}
