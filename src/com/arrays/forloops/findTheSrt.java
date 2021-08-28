package com.arrays.forloops;

import java.util.Scanner;

public class findTheSrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();
          int result=1;
        for (int i = 0; i <y; i++) {
             result*=x;
        }
        System.out.println(result);
    }
}
