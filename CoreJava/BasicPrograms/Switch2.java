package com.demo;

public class Switch2 {
    public static void main(String[] args) {
        int day = 7;
        String dayString=null;
        switch (day) {
            case 1:
                dayString="1, Sunday";
                break;
            case 2:
                dayString="2, Monday";
                break;
            case 3:
                dayString="3, Tuesday";
                break;
            case 4:
                dayString="4, Wednesday";
                break;
            case 5:
                dayString="5, Thrusday";
                break;
            case 6:
                dayString="6, Friday";
                break;
            case 7:
                dayString="7, saturday";
                break;
        }
        System.out.println(dayString);
    }
}
