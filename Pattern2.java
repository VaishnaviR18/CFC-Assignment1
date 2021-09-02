package com.assignment1;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5, row = 1;

        while(row <= n)
        {
            int col = 1;
            while(col <= row){
                System.out.print(col+" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
