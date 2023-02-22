package week05;

import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {

        // two-pointer technique is efficient. We are able to process two elements per loop instead of
        // just one. Common patterns in the two-pointer approach entail:
        //Two pointers, each starting from the beginning and the end until they both meet.
        //One pointer moving at a slow pace, while the other pointer moves at twice the speed.

        // The Two Pointer technique is a pattern in which two pointers iterate across
        // the data structure until one or both of them satisfy the necessary condition.

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

       // int[] pair = new int[2];

        while (rightPointer < leftPointer) {

            if (arr[rightPointer] + arr[leftPointer] < target) {
                rightPointer++;
            } else if (arr[rightPointer] + arr[leftPointer] > target) {
                leftPointer--;
            } else {
                return new int[]{rightPointer, leftPointer};
//                pair[0] = rightPointer;
//                pair[1] = leftPointer;
//                return pair;
            }
        }
        return new int[]{-1, -1};
    }
}
