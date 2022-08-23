package com.demo;

public class NumberPattern {
    public static void main(String[] args) {
        int row = 9;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
