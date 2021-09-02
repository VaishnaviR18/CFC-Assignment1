package com.assignment1;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5, row = 0;

        while(row < n)
        {
            int col = 0;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
