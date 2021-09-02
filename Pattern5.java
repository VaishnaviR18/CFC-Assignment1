package com.assignment1;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5, i=0, j, m = 1;

        while(i <= n){
            j = 0;
            while(j <= i){
                if(j == 0 || i == 0){
                    m = 1;
                }
                else{
                    m = m*(i-j+1)/j;
                }
                System.out.print(m+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
