package week03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2);

        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

        List<Integer> takeWhile = sorted.stream().peek(System.out::println) // 1 1 2 2 3 4
                .takeWhile(p -> p < 4)
                .collect(Collectors.toList());

        System.out.println(sorted); // [1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(takeWhile); // [1, 1, 2, 2, 3]

        System.out.println("----------------------------------------------------------------");

        List<Integer> takeWhile2 = numbers.stream().peek(System.out::println) // 1 2 3 4
                .takeWhile(p -> p < 4)
                .collect(Collectors.toList());

        System.out.println(takeWhile2); // [1, 2, 3]


        System.out.println("----------------------------------------------------------------");

        List<Integer> list = numbers.stream().filter(p -> p % 2 == 0)
                .sorted().peek(System.out::println) // 2 2 4 6 8 10
                .collect(Collectors.toList());

        System.out.println(list); // [2, 2, 4, 6, 8, 10]
    }
}
