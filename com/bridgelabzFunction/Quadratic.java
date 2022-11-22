package com.bridgelabzFunction;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        System.out.println("Enter third value");
        int c = sc.nextInt();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double first = (-b + Math.pow(d,0.5)) / ( 2.0 * a);
            double second = (-b - Math.pow(d,0.5)) / ( 2.0 * a);
            System.out.println("The roots are " + first );
        } else if (d == 0.0){
            double first = ( -b)/(2.0 * a);
            System.out.println("The roots is " + first);
        }else {
            System.out.println("The roots is not real" );
        }

    }
}
