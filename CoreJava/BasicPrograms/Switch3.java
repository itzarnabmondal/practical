package com.demo;

public class Switch3 {
    public static void main(String[] args) {
        char ch ='e';
        switch (ch) {
            case 'y':
                System.out.println("Its not a vowel");
                break;
            case 'e':
                System.out.println("It's a vowel");
                break;
            case 'o':
                System.out.println("Now Vowel");
                break;
            default:
                System.out.println("constant");
                break;
        }
    }
}
