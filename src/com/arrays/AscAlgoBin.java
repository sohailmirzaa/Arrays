package com.arrays;

import java.util.Scanner;

public class AscAlgoBin {

    public static void main(String[] args) {
        int[] arr = {5664,777,666,555,444,33,22,11,2,1};
        int target = 666;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }



    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean Asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target==arr[mid]){
                return mid;
            }
           if (Asc){
               if (target < arr[mid]) {
                   end = mid - 1;
               }
               else if (target>arr[mid]){
                   start= mid+1;
               }
           }
           else {
               if (target >arr[mid]) {
                   end = mid - 1;
               }
               else if (target<arr[mid]){
                   start= mid+1;
               }
           }

        }
        return -1;
}
}
