package week03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhile {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2);

        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

        List<Integer> dropWhile = sorted.stream().peek(System.out::println)
                .dropWhile(p -> p < 4)
                .collect(Collectors.toList());

        System.out.println(sorted); // [1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(dropWhile); // [4, 5, 6, 7, 8, 9, 10]

        System.out.println("----------------------------------------------------------");

        List<Integer> dropWhile2 = numbers.stream().peek(System.out::println) // 1 2 3 4
                .dropWhile(p -> p < 4)
                .collect(Collectors.toList());

        System.out.println(dropWhile2); // [4, 5, 6, 7, 8, 9, 10, 1, 2]

    }
}
