package com.bridgelabz;

public class HarmonicNumber {
    public static void main(String[] args) {
         int n = 8;
        System.out.println("Nth Harmonic number is " +nthHarmonic(n));
    }
    static double nthHarmonic(int n){
        float harmonic = 1;
        for ( int i = 2;i<= n;i++){
            harmonic +=(float) 1/i;        //H2 = H1 + 1/2
        }
        return harmonic;
    }
}
