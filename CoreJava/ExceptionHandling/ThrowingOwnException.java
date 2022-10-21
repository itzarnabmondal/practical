package com.exception;

import java.util.Scanner;
// creating own exception by extending exception class
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class ThrowingOwnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number bellow 100: ");
        int num = sc.nextInt();
        sc.close();
        try {
            if(num > 100)
            // throwing MyException and passing a message
                throw new MyException("Number bigger than 100");
            else
            System.out.println("Number is: "+num);
        }
        catch(MyException e) {
            // getMessage method used to get the message
            System.out.println(e.getMessage());
        }
    }
}
