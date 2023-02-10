package week02;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingVowel3 {

    public static void main(String[] args) {

        System.out.println(getIndexOfFirstNonRepeatingVowel_map("abcdabcde")); // 8
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("abca")); // -1
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("aabb")); // -1
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("aabbe")); // 4
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("a")); // 0

    }

    static int getIndexOfFirstNonRepeatingVowel_map(String input){

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)){
                    map.put(ch, i);
                } else {
                    map.put(ch, -5);
                }
            }
        }
        if (!map.isEmpty()){
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                int index = e.getValue();
                if ( index != -5){
                    return index;
                }
            }
        }
        return -1;
    }
}
