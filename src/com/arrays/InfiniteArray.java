package com.arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 12, 14, 15, 16, 18, 19, 20};

        int target = 15;

        System.out.println(ans(arr, target));
    }
        static int ans(int[]arr, int target){
            //first get a start value
            int start=0;
            int end = 1;
            while(target>arr[end]){
                int temp= end+1;
                end = end+(end-start+1)*2;
                start= temp;
            }
            return binarySearch(arr,target,start,end);
        }

        static int binarySearch (int[] arr, int target, int start, int end){
             start = 0;
             end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

