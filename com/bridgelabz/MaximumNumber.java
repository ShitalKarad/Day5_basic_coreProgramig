package com.bridgelabz;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        if (first>second && first > third){
            System.out.println("Maximum number is "+first);
        } else if (second > first && second > third) {
            System.out.println("Maximum number is "+ second);
            
        } else  {
            System.out.println("Maximum number is "+ third);

        }
    }
}
