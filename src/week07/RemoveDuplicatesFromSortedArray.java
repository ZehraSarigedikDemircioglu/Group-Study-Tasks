package week07;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums)); // 2
        System.out.println(removeDuplicates(nums2)); // 5

        System.out.println("---------------------------------------------------");

        removeDuplicates2(nums); // [1, 2]
        removeDuplicates2(nums2); // [0, 1, 2, 3, 4]

        System.out.println("---------------------------------------------------");

        System.out.println(removeDuplicates3(nums)); // 2
        System.out.println(removeDuplicates3(nums2)); // 5

        System.out.println("---------------------------------------------------");

        System.out.println(removeDuplicates4(nums)); // 2
        System.out.println(removeDuplicates4(nums2)); // 5
    }

    public static int removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray().length;
    }

    public static void removeDuplicates2(int[] array) {
        Arrays.stream(array).distinct().forEach(System.out::println);
    }

    public static int removeDuplicates3(int[] array) {

        Set<Integer> set = new HashSet<>();

        for (int each : array) {
            set.add(each);
        }

        return set.size();
    }

    public static int removeDuplicates4(int[] array) {

        int j = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[j] = array[i];
                j++;
            }
        }
        return j;
    }

}
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in Java, you must instead have the result be placed in
the first part of the array nums. More formally, if there are k elements after removing the duplicates, then
the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with
O(1) extra memory.
Example 1:
Input: nums = [1, 1, 2] Output: 2, nums = [1, 2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2
respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4
respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
