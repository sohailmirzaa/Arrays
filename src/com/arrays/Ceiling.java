package com.arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,14,16,22,23,44};
        int target = 21;
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
        return start;
    }
}

