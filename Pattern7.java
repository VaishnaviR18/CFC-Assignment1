package com.assignment1;

public class Pattern7 {
    public static void main(String[] args) {
        int i, j, k=0, n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=i*2;j<=n*2-1;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++){
            for(j=n-1;j>=i;j--){
                System.out.print("*");
            }
            for(j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            for(j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
