package com.bridgelabz;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int remainder = first %second;
        int quotient = first /second;
        System.out.println("remainder "+remainder);
        System.out.println("quotient " +quotient);
    }
}
