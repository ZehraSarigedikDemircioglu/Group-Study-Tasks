package week02;

public class NonRepeatingVowel {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingVowel("abcdabcde")); // 8
        System.out.println(firstNonRepeatingVowel("abca")); // -1
        System.out.println(firstNonRepeatingVowel("aabb")); // -1
        System.out.println(firstNonRepeatingVowel("aabbe")); // 4
        System.out.println(firstNonRepeatingVowel("a")); // 0
    }

    public static String firstNonRepeatingVowel(String str) {

        String vowel = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel += str.charAt(i);
            }
        }

        for (int i = 0; i < vowel.length(); i++) {
            int count = 0;
            for (int j = 0; j < vowel.length(); j++) {
                if (vowel.charAt(i) == vowel.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                unique += str.indexOf(vowel.charAt(i));
            }
        }
        if (unique.isEmpty()) {
            return "-1";
        }
        return unique;
    }
}


/*
First Non-repeating Vowel
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
lowercase.

( Do not use String class functions other than charAt() and length() )

 */



