package com.bridgelabzFunction;

public class Distance {
    public static void main(String[] args) {
        int x =  Integer.valueOf(args[0]);
        int y = Integer.valueOf(args[1]);
        distance(x , y);    }

    public  static void distance(int x, int y){
        int first = x*x;
        int second = y*y;
        double sum = first + second;
        double distance = Math.sqrt(sum);
        System.out.println("Distance "+ distance);
    }
}
