package com.assignment1;

public class Pattern9 {
    public static void main(String[] args) {
        int i,j,n=5;

        for (i=n;i>=1;i--) {
            for (j=n;j>=i;j--) {
                System.out.print(j);
            }
            for (j=1;j<(i*2)-1;j++){
                System.out.print(i);
            }
            for (j=i+1;j<=n;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (i=2;i<=n;i++) {
            for (j=n;j>=i;j--) {
                System.out.print(j);
            }
            for (j=1;j<(i*2)-1;j++) {
                System.out.print(i);
            }
            for (j=i+1;j<=n;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
