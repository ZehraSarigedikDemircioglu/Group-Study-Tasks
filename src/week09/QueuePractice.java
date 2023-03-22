package week09;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, does not accept null
        queue1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        queue1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(queue1); // [1, 2, 1, 3, 5, 3, 2, 4, 4, 5]

        queue1.poll();

        System.out.println(queue1); // [1, 2, 2, 3, 5, 3, 5, 4, 4]

        queue1.poll();

        System.out.println(queue1); // [2, 3, 2, 4, 5, 3, 5, 4]

        queue1.peek();

        System.out.println(queue1); // [2, 3, 2, 4, 5, 3, 5, 4]
//        queue1.offer(10); // like put method but random order

        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1); // []
        System.out.println(queue1.peek()); // null

        System.out.println("-----------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order, does not accept null
        queue2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        queue2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(queue2); // [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        queue2.poll();

        System.out.println(queue2); // [2, 3, 4, 5, 1, 2, 3, 4, 5]

        queue2.poll();

        System.out.println(queue2); // [3, 4, 5, 1, 2, 3, 4, 5]

        System.out.println(queue2.peek()); // 3

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll(); // even it is more than size of list, it still give [], no exception message

        System.out.println(queue2); // []
        System.out.println(queue2.peek()); // null
    }
}
