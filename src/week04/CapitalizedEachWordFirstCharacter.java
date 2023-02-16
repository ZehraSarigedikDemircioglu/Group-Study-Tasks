package week04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizedEachWordFirstCharacter {

    public static void main(String[] args) {

        String str = "smart cookies are getting closer to the their goals every day";

        String sentence = Arrays.stream(str.split(" "))
                .map(p -> p.substring(0, 1).toUpperCase() + p.substring(1))
                .collect(Collectors.joining(" ")).trim();

        System.out.println(sentence);
    }
}
