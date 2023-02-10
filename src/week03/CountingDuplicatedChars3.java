package week03;

public class CountingDuplicatedChars3 {

    public static void main(String[] args) {

        System.out.println(duplicatesNumber("abcde")); // 0
        System.out.println(duplicatesNumber("aabbcde")); // 2 (a and b)
        System.out.println(duplicatesNumber("aabBcde")); // 2 (a and b)
        System.out.println(duplicatesNumber("indivisibility")); // 1 (i)
        System.out.println(duplicatesNumber("Indivisibilities")); // 2 (i and s)
        System.out.println(duplicatesNumber("aA11")); // 2 (a and 1)
        System.out.println(duplicatesNumber("ABBA")); // 2 (a and b)
    }
    public static int duplicatesNumber(String str){

        String[] arrayStr = str.toLowerCase().split("");
        String newString = "";

        for (String each : arrayStr) {
            int count = 0;
            for (String result : arrayStr) {
                if(result.equals(each)){
                    count++;
                }
            }
            if(count > 1 && !(newString.contains(each))){
                newString += each;
            }
        }
        return newString.length();
    }
}
