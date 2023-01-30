package week01;

import java.util.ArrayList;
import java.util.Collections;

public class FakedBinary {

    public static void main(String[] args) {

        String number = "45385593107843568";
        String result = "";

        for (int i = 0; i < number.length(); i++) {
           if (Integer.parseInt(number.charAt(i) + "") < 5){

               number = number.replace((number.charAt(i) + ""),"0");
               result = number;
           }

        }
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(number.charAt(i)+"")>=5){

                number=number.replace((number.charAt(i)+""),"1");
                result=number;
            }
        }

        System.out.println(result);


    }
}
