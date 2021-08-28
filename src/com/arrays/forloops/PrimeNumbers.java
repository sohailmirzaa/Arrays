package com.arrays.forloops;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        boolean isPrime= true;

        for (int i = 2; i*i <a; i++) {

            if (a%i==0){
                isPrime=false;
                System.out.println("this is not a prime number"+isPrime);
            }
           else if (a==1){
                isPrime=false;
            }
           else {
                System.out.println("this is prime number"+isPrime);
            }
           break;
        }

    }
}
