package week19.SumOfDigits;

public class Solution {

    public static void main(String[] args) {

        System.out.println(sumDigits(16)); // 7
        System.out.println(sumDigits(942)); // 6
        System.out.println(sumDigits(132189)); // 6
        System.out.println(sumDigits(493193)); // 2
    }

    public static int sumDigits(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum < 10) {
            return sum;
        }
        return sumDigits(sum);
    }
}
/*
Given n, take the sum of the digits of n, if that value has more than one digit, continue reducing in this way until
a single-digit number is produced.
Examples:
16 à 1 + 6 = 7
942 à 9 + 4 + 2 = 15 à 1 + 5 à 6
132189 à 1 + 3 + 2 + 1 + 8 + 9 + 24 à 2 + 4 = 6
493193 à 4 + 9 + 3 + 1 + 9 + 3 = 29 à 2 + 9 = 11 à 1 + 1 = 2
Constraints: The input will be a non-negative integer.
 */
