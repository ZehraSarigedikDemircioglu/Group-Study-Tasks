package week07;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12}; // [1, 3, 12, 0, 0]
        int[] nums2 = {0}; // [0]

        System.out.println(Arrays.toString(moveZerosToTheEnd(nums)));
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums2)));

        moveZeros(nums);
        moveZeros(nums2);

    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int count = 0;

//        for (int each : array) {
//            if (each != 0) {
//                array[count++] = each;
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] !=0){
                array[count++] = array[i];
            }
        }

        while (count < array.length) {
            array[count++] = 0;
        }
        return array;
    }

    public static void moveZeros(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        int addZeroes = nums.length - list.size();
        for (int i = 0; i < addZeroes; i++) {
            list.add(0);
        }
        System.out.println(list);

    }
}

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the arr
 */
