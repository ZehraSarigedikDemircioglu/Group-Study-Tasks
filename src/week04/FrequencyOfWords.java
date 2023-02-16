package week04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FrequencyOfWords {

    public static void main(String[] args) {

        String[] array = {"Apple", "Banana", "Apple", "Cherry", "apple"};
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(array).distinct()
                .forEach(i -> map.put(i, (int)Arrays.stream(array).filter(p -> p.equals(i)).count()));
        System.out.println(map);

        System.out.println("--------------------------------------------------------------");

        Arrays.stream(array).filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        System.out.println("--------------------------------------------------------------");

        String[] array2 = {"Apple", "Banana", "Apple", "Cherry", "apple"};
        Map<String, Integer> map2 = new HashMap<>();

        for (String each : array2) {
            map2.put(each, map2.getOrDefault(each, 0) + 1);
        }

        for (Map.Entry<String, Integer> each : map2.entrySet()) {
            System.out.println(each.getKey() + " = " + each.getValue()); // to get each element from the map
        }
    }
}
/*
Write a function that takes a String array as a parameter, and returns a map object that
contains each element of array as key and their occurrence counts as value.
Case-sensitive and order is not important.
 */
