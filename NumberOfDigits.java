package com.assignment1;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 123456, count = 0, rem;
        int m = n;

        while(m != 0) {
            rem = m%10;
            m = m/10;
            count++;
        }
        System.out.println("Number of digits in a number "+n+" is "+count);
    }
}
