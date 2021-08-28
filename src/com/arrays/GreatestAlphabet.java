package com.arrays;

public class GreatestAlphabet {
    public static void main(String[] args) {
        int[] letter = {'a','b','c','d','e','f'};
        int target = 'g';
        int ans = nextGreatestLetter(letter, target);
        System.out.println(ans);
    }



    static int nextGreatestLetter(int[] letter, int target) {
        int start = 0;
        int end = letter.length - 1;
        boolean Asc = letter[start] < letter[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target==letter[mid]){
                return mid;
            }
            if (Asc){
                if (target < letter[mid]) {
                    end = mid - 1;
                }
                else if (target>letter[mid]){
                    start= mid+1;
                }
            }
            else {
                if (target >letter[mid]) {
                    end = mid - 1;
                }
                else if (target<letter[mid]){
                    start= mid+1;
                }
            }

        }
        return letter[start % letter.length];
    }

}
