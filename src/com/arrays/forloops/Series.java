package com.arrays.forloops;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
float ans = 0;
        for (float i = 1; i <=n ; i++) {
            if (i % 2 == 0) {
                ans -= 1 / i;
            }
                else {
                    ans+= 1 / i;
                }


        }
        System.out.println(ans);
    }
}
