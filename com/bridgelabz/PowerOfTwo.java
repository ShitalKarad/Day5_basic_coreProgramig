package com.bridgelabz;

public class PowerOfTwo {
    public static void main(String[] args) {
        int power = Integer.parseInt(args[0]);

        int sum = 1;
        if(power<31){
        for (int i = 1 ; i<=power;i++) {
            sum = sum * 2;
        }
            System.out.println("2^"+power +" = "+sum);
        }else {
            System.out.println("Enter correct power");
        }

    }
}
