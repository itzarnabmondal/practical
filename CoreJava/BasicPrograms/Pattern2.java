package com.demo;

public class Pattern2 {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}