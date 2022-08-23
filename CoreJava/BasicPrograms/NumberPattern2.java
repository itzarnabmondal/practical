package com.demo;

public class NumberPattern2 {
    public static void main(String[] args) {
        int row = 9;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
