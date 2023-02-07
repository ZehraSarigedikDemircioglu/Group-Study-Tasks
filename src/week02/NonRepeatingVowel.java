package week02;

public class NonRepeatingVowel {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingVowel("abcdabcde")); // 8
        System.out.println(firstNonRepeatingVowel("abca")); // -1
        System.out.println(firstNonRepeatingVowel("aabb")); // -1
        System.out.println(firstNonRepeatingVowel("aabbe")); // 4
        System.out.println(firstNonRepeatingVowel("a")); // 0
    }

    public static int firstNonRepeatingVowel(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                int vowelCount = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1) {
                    return i;
                }
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



