package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of times you want to flip the coin :");
        double num = sc.nextDouble();
        double percentHead = 0;
        double percentTail = 0;
        int head = 0;
        int tail = 0;
        for( int i = 0; i<=num;i++){
            double random = Math.random();
            if (random <= 0.5){
                head++;
            }else {
                tail++;
            }
        }
        percentHead = (head * 100)/(double)num;
        percentTail = (tail * 100)/(double)num;
        System.out.println("the head flip "+head+" times \n percentage is " +percentHead);
        System.out.println("the tail flip "+tail+" times \n percentage is " +percentTail);
    }
}
