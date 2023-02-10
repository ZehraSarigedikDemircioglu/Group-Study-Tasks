package week03;

public class CountingDuplicatedChars2 {

    public static void main(String[] args) {

        duplicatesNumber("abcde"); // 0
        duplicatesNumber("aabbcde"); // 2 (a and b)
        duplicatesNumber("aabBcde"); // 2 (a and b)
        duplicatesNumber("indivisibility"); // 1 (i)
        duplicatesNumber("Indivisibilities"); // 2 (i and s)
        duplicatesNumber("aA11"); // 2 (a and 1)
        duplicatesNumber("ABBA"); // 2 (a and b)
    }

    public static void duplicatesNumber(String str){

        str.toLowerCase();
        int countDupChars = 0;
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            for (int j = i+1; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    if(!result.contains("" + ch1)){
                        result += ch1;
                        countDupChars++;
                    }
                }
            }
        }
        System.out.println("All duplicated chars: " + result);
        System.out.println("Total number of duplicated chars: " + countDupChars);

    }
}
/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
 */
