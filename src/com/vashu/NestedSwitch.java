package com.vashu;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department =  in.next();

        switch (empID) {
            case 1 -> System.out.println("vashu");
            case 2 -> System.out.println("yash");
            case 3 -> {
                System.out.println("emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("NO Department ");
                }
            }
            default -> System.out.println("Enter correct employee ID");
        }
    }
}
