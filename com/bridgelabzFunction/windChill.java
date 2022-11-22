package com.bridgelabzFunction;

public class windChill {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]); // temperature
        double speed = Double.parseDouble(args[1]); // wind speed (mph)
        if (temp > 50 && speed < 120 || speed > 3 ) {
            double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
            System.out.println(" temperature  " + temp +  " and a wind speed of " + speed + " mph" + "=> "+ windChill);

        }else {
            System.out.println("Enter the correct values of temp & speed ");
        }
    }
}
