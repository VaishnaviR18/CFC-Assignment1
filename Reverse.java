package com.assignment1;

public class Reverse {
    public static void main(String[] args) {
        int num = 5691, rev = 0;
        int n = num;

        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of a number "+n+" is "+rev);
    }
}
