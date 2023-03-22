package week09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistPractice {

    public static void main(String[] args) {

        List<Integer> list= new LinkedList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list); // [1, 2, 3, 4, 5]

        list.add(6);
        System.out.println(list); // [1, 2, 3, 4, 5, 6]
        list.add(6, 7);
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7]
        list.set(0, 10);
        System.out.println(list); // [10, 2, 3, 4, 5, 6, 7]
        list.set(1, 20);
        System.out.println(list); // [10, 20, 3, 4, 5, 6, 7]
        list.add(2, 30);
        System.out.println(list); // [10, 20, 30, 4, 5, 6, 7]
    }
}
