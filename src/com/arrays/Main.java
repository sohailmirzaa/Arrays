package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
//input
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                System.out.println(Arrays.toString(arr[row]));
            }
        }

    }
}
