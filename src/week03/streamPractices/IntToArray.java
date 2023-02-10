package week03.streamPractices;

import java.util.Arrays;

public class IntToArray {

    public static void main(String[] args) {

        int num = 490;
        int[] digits = Integer.toString(num).chars().map(p -> p - '0').toArray();
        System.out.println(Arrays.toString(digits));
    }
}
