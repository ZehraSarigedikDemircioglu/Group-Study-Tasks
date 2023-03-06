package week07;

import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12}; // [1, 3, 12, 0, 0]
        int[] nums2 = {0}; // [0]

        System.out.println(Arrays.toString(moveZerosToTheEnd(nums)));
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums2)));

    }
    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];

        int count = 0;

        for (int each : array) {
            if (each != 0) {
                result[count++] = each;
            }
        }
        return result;
    }
}
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the arr
 */
