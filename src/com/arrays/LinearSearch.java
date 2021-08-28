package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1122,33,333,443,12,344};
        int target=12;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }

     static int linearsearch(int[] arr, int target) {

        if (arr.length==0){
            return -1;
        }
         for (int index = 0; index < arr.length ; index++) {
             int element=arr[index];
             if (element==target){

                 return index;
             }
         }
         return -1;
    }


}
