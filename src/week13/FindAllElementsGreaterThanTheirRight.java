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

        find2(arr);

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == arr.length - 1) {
                    System.out.print(arr[i] + " ");
                }
            }
//            System.out.print(arr[i] + " ");
        }
    }
}
/*
Given an unsorted integer array, return all greater elements than all elements present to their right using Stack.
 */