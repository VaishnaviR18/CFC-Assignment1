package com.assignment1;

import java.util.Scanner;

public class Credits {
    public static void main(String[] args) {
        int credits;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the credits:");
        credits = s.nextInt();

        if(7500 <= credits){
            System.out.println("Tera leader");
        }
        else if(6000 <= credits){
            System.out.println("Gega leader");
        }
        else if(4500 <= credits){
            System.out.println("Mega leader");
        }
        else {
            System.out.println("Rising Star");
        }
        /*else if(credits < 4500){
            System.out.println("Rising Star");
          }
         */
    }
}
