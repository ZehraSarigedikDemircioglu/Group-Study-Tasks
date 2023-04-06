package week11;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {1, 2, 3}; // [1, 2, 4]
        int[] digits2 = {4, 3, 2, 1}; // [4, 3, 2, 2]
        int[] digits3 = {9}; // [1, 0]
        int[] digits4 = {8, 9, 9, 9}; // [9, 0, 0, 0]

        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(plusOne(digits4)));

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }else if(digits[i] == 9) {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
of the integer. The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
 */