package com.assignment1;

public class Pattern6 {
    public static void main(String[] args) {
        int i = 1, n = 5, k = 0;

        while(i <= n){
            int j = 1;
            while(j <= n-i){
                System.out.print("  ");
                j++;
            }
            while(k != 2*i-1){
                System.out.print("* ");
                k++;
            }
            k = 0;
            i++;
            System.out.println();
        }
        i=n-1;
        while(i > 0){
            int j = 0;
            while(j < n-i){
                System.out.print("  ");
                j++;
            }
            while(k < (i*2)-1 ){
                System.out.print("* ");
                k++;
            }
            k = 0;
            i--;
            System.out.println();
        }
    }
}
