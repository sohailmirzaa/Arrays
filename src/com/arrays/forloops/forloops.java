package com.arrays.forloops;

public class forloops {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i=i+1) {
//            System.out.print("hello World");
//            System.out.println(i);
//
//        }
//        int sum=0;
//        int n=5;
//        for (int i = 1; i <=n; i++) {
//            sum= sum+i;
//
//        }
//        System.out.println(sum);
        for (int j = 1; j<10; j++) {
            for (int i = j; i <j ; i++) {
                for (int a = 1; a <i ; a++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
