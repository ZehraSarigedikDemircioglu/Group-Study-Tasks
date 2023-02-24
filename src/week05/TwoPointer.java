package week05;

import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {

        // Time Complexity:  O(n)

        int arr[] = {2, 3, 5, 8, 9, 10, 11};
        int arr2[] = {2, 3, 5, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(sum(arr, 5))); // [0, 1]
        System.out.println(Arrays.toString(sum(arr, 25))); // [-1, -1]
        System.out.println(Arrays.toString(sum(arr2, 17))); // [2, 7]
    }

    public static int[] sum(int[] arr, int target) {

        int rightPointer = 0;
        int leftPointer = arr.length - 1;

        while (rightPointer < leftPointer) {

            if (arr[rightPointer] + arr[leftPointer] < target) {
                rightPointer++;
            } else if (arr[rightPointer] + arr[leftPointer] > target) {
                leftPointer--;
            } else {
                return new int[]{rightPointer, leftPointer};
            }
        }
        return new int[]{-1, -1};
    }
}
