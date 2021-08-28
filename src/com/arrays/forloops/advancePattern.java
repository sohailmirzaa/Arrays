package com.arrays.forloops;

import java.util.Scanner;

public class advancePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
      int   number =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(number++ +" ");
            }
            System.out.println();

        }
    }
}
