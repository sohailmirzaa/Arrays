package com.arrays.forloops;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        for (int j = 1; j <=n; j++) {
            for (int i = 1; i <=j ; i++) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }

    }


}

