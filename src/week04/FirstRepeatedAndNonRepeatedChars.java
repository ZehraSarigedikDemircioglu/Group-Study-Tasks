package week04;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedAndNonRepeatedChars {

    public static void main(String[] args) {

        System.out.println(firstRepeatedCharacter("success")); // s
        System.out.println(firstRepeatedCharacter("ddffgfgi")); // d
        System.out.println(firstNonRepeatedCharacter("success")); // u
        System.out.println(firstNonRepeatedCharacter("ddffgfgi")); // i

    }

    public static String firstNonRepeatedCharacter(String str) {

        Map<Character, Long> map = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeatedChar = map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst();

        return "First Non-Repeated Character " + firstNonRepeatedChar.orElseThrow();

    }

    public static String firstRepeatedCharacter(String str) {

        Map<Character, Long> map = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstRepeatedChar = map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey()).findFirst();

        return "First Repeated Character " + firstRepeatedChar.orElseThrow();

    }
}
