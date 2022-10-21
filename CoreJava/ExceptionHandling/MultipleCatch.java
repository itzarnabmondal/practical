package com.exception;

import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) { // Main method
        int x, y, z;
        int[] arr = null;
        Scanner sc = new Scanner(System.in); // Creating Scanner object 
        System.out.println("Enter 1st number: ");
        x = sc.nextInt(); // Taking user input
        System.out.println("Enter 2nd Number: ");
        y = sc.nextInt();
        sc.close();
        try {
            z = x / y; 
            System.out.println(arr[0]);
        }
        catch (ArithmeticException e) { // Catch 1
            z = 0;
            System.out.println(e);
        }
        catch (NullPointerException e) { // Catch 2
            System.out.println(e);
        }
    }
    
}
