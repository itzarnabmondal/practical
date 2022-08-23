package com.demo;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int result=0;
        System.out.println("All elements are: ");
        for (int k : arr) {
            System.out.println(k);
            result += k;
        }
        System.out.println("***************");
        System.out.println("And sum is: "+result);
    }
}
