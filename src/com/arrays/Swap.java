package com.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr= {18,22,33,44,55};
        //swap(arr,3,6);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }

 static  void reverse(int[] arr){
        //swap
       int start=0;
       int end =arr.length-1;
       swap(arr,start,end);
 }

     static void swap(int[] arr, int index1, int index2) {
       int  temp= arr[index1];
       arr[index1]= arr[index2];
       arr[index2]=temp;
    }
}
