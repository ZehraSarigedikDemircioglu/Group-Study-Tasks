package week04;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxNumber {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        OptionalInt maxNum = Arrays.stream(array).reduce(Integer::max);
        System.out.println(maxNum.getAsInt());

    }
}
