package week04;

import java.util.Arrays;

public class IntToArray {

    public static void main(String[] args) {

        int num = 490;
        int[] digits = Integer.toString(num).chars().map(p -> p - '0').toArray(); // '0'=48 in ascii table p- 48 is same
        System.out.println(Arrays.toString(digits));
    }
}
