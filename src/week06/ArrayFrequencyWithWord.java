package week06;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyWithWord {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};
        System.out.println(frequencyWithWord(arr)); // {1=two, 2=five, 3=three, 4=two}
        System.out.println(frequencyWithWord(arr2)); // {1=two, 2=more than ten, 3=three, 4=two}
    }

    public static Map<Integer, String> frequencyWithWord(int[] array) {

        Map<Integer, String> map = new HashMap<>();
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};


        for (int each : array) {

            int count = 0;

            for (int element : array) {
                if (each == element) {
                    count++;
                }
            }

            if (count > 10) {
                map.put(each, words[11]);
            } else {
                map.put(each, words[count]);
            }
        }
        return map;
    }
}
/*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five
*/

