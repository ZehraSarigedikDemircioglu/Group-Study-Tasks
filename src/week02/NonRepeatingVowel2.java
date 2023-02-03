package week02;

import java.util.ArrayList;
import java.util.Collections;

public class NonRepeatingVowel2 {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingVowel("abcdabcde")); // 8
        System.out.println(firstNonRepeatingVowel("abca")); // -1
        System.out.println(firstNonRepeatingVowel("aabb")); // -1
        System.out.println(firstNonRepeatingVowel("aabbe")); // 4
        System.out.println(firstNonRepeatingVowel("a")); // 0

    }

    public static int firstNonRepeatingVowel(String word) {

        boolean b;

        ArrayList<Character> ch = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            b = word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u';
            if (b) {
                ch.add(word.charAt(i));
            }
        }
        for (int i = 0; i < ch.size(); i++) {
            if (Collections.frequency(ch, ch.get(i)) == 1) {
                int index=word.indexOf(ch.get(i));
                return index;
            }
        }

        return -1;
    }
}

/*
First Non-repeating Vowel
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
lowercase.

( Do not use String class functions other than charAt() and length() )

 */


