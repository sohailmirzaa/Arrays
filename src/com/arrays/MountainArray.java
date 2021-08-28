//package com.arrays;
//
//public class MountainArray {
//    public static void main(String[] args) {
//int arr[]={1,2,3,4,5,6,5,4,3,2,1};
//        System.out.println(peakIndexInMountainArray(arr));
//    }
//
//    public int peakIndexInMountainArray(int[]arr){
//    int start=0;
//    int end= arr.length-1;
//    while(start< end){
//        int mid = start+(end-start)/2;
//        if (arr[mid]>arr[mid+1]){
//            end=mid;
//            //this is happening cause the mid is greater than all of the element on the left hand side and right hand side
//            //so the end = mid to finish of the program
//            //if the mid is not grater then mid+1 then start will mid +1;
//
//        }
//        else{
//            start= mid+1;
//        }
//        // the ans in this solution is the mid= start or end value the greater element in the mountain arrray
//
//    }
//    return end;
//    }
//}
