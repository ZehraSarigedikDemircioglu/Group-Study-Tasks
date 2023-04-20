package week13;

import java.util.Arrays;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(10, 4, 6, 3, 5));

        System.out.println(stack); // [10, 4, 6, 3, 5]

        System.out.println(stack.peek()); // 5 gives last element of Stack
        System.out.println(stack.pop()); // 5 LIFO = last in - first out
        System.out.println(stack); // [10, 4, 6, 3] remove last item from Stack
        stack.push(5);
        System.out.println(stack); // [10, 4, 6, 3, 5] add item into Stack as a last item

    }
}
