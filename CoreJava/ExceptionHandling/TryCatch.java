package com.exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        x = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        y = sc.nextInt();
        try {
            z = x / y; // Code that may throw an exception.
        } catch (ArithmeticException e) {
            // Code to handle the exception.
            z = 0;
            System.out.println(e); // It prints the exception.
        }
    }
}