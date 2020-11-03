package com.ocp;

public class PrintStars {
    public static void main(String[] args) {
        int line =5;
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
