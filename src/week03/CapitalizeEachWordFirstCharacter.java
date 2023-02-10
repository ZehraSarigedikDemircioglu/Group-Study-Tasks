package week03;

public class CapitalizeEachWordFirstCharacter {

    public static void main(String[] args) {

        System.out.println(capitalizeEachWord("How can mirrors be real if our eyes aren't real"));
        System.out.println(capitalizeEachWord(" "));
        System.out.println(capitalizeEachWord("smart cookies are getting closer to the their goals every day"));
    }

    public static String capitalizeEachWord(String sentence) {

        String[] arrayStr = sentence.split(" ");
        String result = "";

        if(!(sentence.isEmpty() || sentence.isBlank())){
            for (String each : arrayStr){
                result += each.substring(0, 1).toUpperCase() + each.substring(1) + " ";
            }
            return result.trim();
        }else{
            return null;
        }
    }
}
/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After
Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word. For
simplicity, you'll have to capitalize each word, check out how contractions are expected to
be in the example below.
Your task is to write a method that converts strings to how they would be written by Jaden
Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the
same way he originally typed them.
Note that this function should a return empty string for an empty string or null.
Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */
