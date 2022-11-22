package com.bridgelabz;

public class SwapTwoNumber {
     static int empty;
    public static void main(String[] args) {
        int first = 10;
        int second = 5;
        System.out.println("First value is " +first+" & "+ "Second value is " + second );
         empty = second;
        second = first;
        first = empty;
        System.out.println( "After swapping First value is  "+first +" & "+"second value is " +second);

    }
}
