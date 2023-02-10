package week03;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountingDuplicatedChars {

    public static void main(String[] args) {

        System.out.println(getNumber("abcde")); // 0
        System.out.println(getNumber("aabBcdE")); // 2 (a and b)
        System.out.println(getNumber("aA11")); // 2 (a and 1)
        System.out.println(getNumber("invisibility")); // 1 (i)
        System.out.println(getNumber("invisibilities")); // 2 (i and s)
    }
    public static int getNumber(String str) {

        Map<Character, Integer> charMap = new LinkedHashMap<>();
        char[] arr = str.toLowerCase().toCharArray();

        for (char each : arr) {
            charMap.put(each, charMap.getOrDefault(each, 0) + 1);
            /*
            if(!(charMap.containsKey(each))){
                charMap.put(each, 1);
            }else{
                charMap.put(each, charMap.get(each) + 1);
            }

             */
        }

        charMap.entrySet().removeIf(p -> p.getValue() == 1);
        return charMap.size();
    }
}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
that occur more than once in the input string. The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric digits.

“abcde” -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */
