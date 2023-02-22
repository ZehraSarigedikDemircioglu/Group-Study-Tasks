package week05;

import java.util.Arrays;

public class WithoutTwoPointer1 {

    public static void main(String[] args) {

        // Time Complexity:  O(n^2)

        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };
        System.out.println(Arrays.toString(sum(arr, 5))); // [0, 1]
        System.out.println(Arrays.toString(sum(arr, 25))); // [-1, -1]
    }

    public static int[] sum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

