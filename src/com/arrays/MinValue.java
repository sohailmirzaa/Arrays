package com.arrays;

public class MinValue {

    public static void main(String[] args) {
        int [] arr= {11,-2,33,44,99,112};
        int ans=arr[0];;
int max= arr[0];
        //minimum


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the minimum number is"+" "+ans);
        System.out.println("the maximum number is"+" "+max);
    }
}
