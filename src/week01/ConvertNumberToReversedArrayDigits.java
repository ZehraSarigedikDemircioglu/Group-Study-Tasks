package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConvertNumberToReversedArrayDigits {

    public static void main(String[] args) {

        Integer input = 123;
        String result = input.toString();
        String[] arr = result.split("");
        String arrResult = "";

        if(input > 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                arrResult += arr[i];
            }
            System.out.println(Arrays.toString(arrResult.toCharArray()));
        }else{
            System.out.println(Arrays.toString(input.toString().toCharArray()));
        }


    }
}
