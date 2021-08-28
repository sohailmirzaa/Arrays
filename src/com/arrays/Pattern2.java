package com.arrays;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i-1 ; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k <=n-i+1; k++) {
                System.out.print("*");;
            }
            System.out.println();
        }
    }
}
