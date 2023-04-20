package week13;

import java.util.List;
import java.util.Stack;

public class FindAllElementsGreaterThanTheirRight {

    public static void main(String[] args) {

        int[] arr = {10, 4, 6, 3, 5};
        int[] arr2 = {2, 4, 6, 3};
        int[] arr3 = {2, 4, 6};
        System.out.println(find(arr)); // [10, 6, 5]
        System.out.println(find(arr2)); // [6, 3]
        System.out.println(find(arr3)); // [6]

        find2(arr); // 10 6 5

    }

    public static List<Integer> find(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int each : arr) {
            while (!stack.isEmpty() && stack.peek() < each) {
                stack.pop();
            }
            stack.push(each);
        }
        return stack;
    }

    public static void find2(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == arr.length - 1) { //  //if 'j' reached to last index, that means array[i] is greater than all elements to its right, so print array[i]
                    System.out.print(arr[i] + " ");
                }
            }
            if (i == arr.length - 1) { // printing the last element as there is no element right to it, so consider it as last greater element
                System.out.print(arr[i] + " ");
            }
        }
    }
}
/*
Given an unsorted integer array, return all greater elements than all elements present to their right using Stack.
 */
