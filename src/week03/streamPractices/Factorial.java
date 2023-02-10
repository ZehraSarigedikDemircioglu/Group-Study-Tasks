package week03.streamPractices;

import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {

            int num = 5;
            long factorial1 = 1;
            for(int i = 1; i <= num; i++) {
                factorial1 *= i;
            }
            System.out.println(factorial1);

        System.out.println("---------------------------------------------------------------");

        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
       // System.out.println(factorial(-1));
    }

    public static int factorial(int number){

        if(number <= 0) {
            throw new RuntimeException("Invalid number");
        }else{
            return IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
        }
    }
}
/*
Write a method that returns the factorial number of any given number.
 */
