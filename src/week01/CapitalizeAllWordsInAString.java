package week01;

public class CapitalizeAllWordsInAString {

    public static void main(String[] args) {

        String sentence = "How can mirrors be real if our eyes aren't real";

        String[] arraySentence = sentence.split(" ");
        String result = "";


        for (String each : arraySentence){
            result += each.substring(0, 1).toUpperCase() + each.substring(1) + " ";
        }

        System.out.println(result.trim());

    }
}
