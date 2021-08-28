package com.arrays.forloops;

import java.util.Scanner;

public class complexStar2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println('*');//for printing first Star
        //first start is taking 1 slot so will print from 2
        //for the rest of the triangle this loop will run till before the end of the n no of star.
        for (int i =2; i <=n-1; i++) {
            System.out.print("* ");
            //for printing spaces in between the star
            for (int j = 1; j <=i-2; j++) {
                System.out.print("  ");
            }
            //loop will print the end start of the hollow triangle
            System.out.print("* ");
            System.out.println();
        }
        //now for the end line of stars
        for (int i = 1; i <=n ; i++) {//this will print n number of stars at the end of the triangle
            // which is making a straight line.
            System.out.print("* ");

        }
    }
}