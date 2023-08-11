package com.vashu;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,6,7,8,9,0);
        multiple(2, 4, 5, 6, 54);
    }
    static void multiple (int a, int b, int...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
