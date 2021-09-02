package com.assignment1;

public class Gcd {
    public static void main(String[] args) {
        int a = 12, b = 20;

        while(a != b){
            if(a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("GCD of a & b = " + a);
    }
}
