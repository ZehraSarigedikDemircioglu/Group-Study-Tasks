package week15;

public class AlterCase {

    public static void main(String[] args) {

        System.out.println(alternateCase("We are the world", true));
        System.out.println(alternateCase("this is some code", true));
    }

    private static String alternateCase(String str, boolean isUpperCase) {

        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (Character.isAlphabetic(ch)) {
            if (isUpperCase) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            return ch + alternateCase(str.substring(1), !isUpperCase);
        }else{
            return ch + alternateCase(str.substring(1), isUpperCase);
        }
    }
}
/*
Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
characters are ASCII.
Output: For each sentence from standard input, return a string which contains a sentence in each line such that
the first character is uppercase, the next character is lowercase and so on.
Test 1
Test Input: We are the world
Expected Output: We ArE tHe WoRlD
Test 2
Test Input: this is some code
Expected Output: ThIs Is SoMe CoDe
 */
