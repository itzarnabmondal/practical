package com.exception;

import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        int x, y, z;
        int[] arr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        x = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        y = sc.nextInt();
        try {
            z = x / y; // Code that may throw an exception.
            try { // Inner Try
                System.out.println(arr[0]);
            } catch (NullPointerException e) { // Inner catch.
                System.out.println(e);
            }
        }
        catch (ArithmeticException e) { // Outer catch
            z = 0;
            System.out.println(e); // It prints the exception.
        }
    }
}
