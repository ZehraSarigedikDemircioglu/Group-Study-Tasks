package week12;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(2)); // false
        System.out.println(isHappy(19)); // true
    }
    public static boolean isHappy(int n) {
        // first squares and sum of them while n > 0, if the result = 1, then true

        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            int sumOfSquares = 0;

            while (n > 0) {
                sumOfSquares += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sumOfSquares;
        }
        return n == 1 ? true : false;
    }
}
/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */