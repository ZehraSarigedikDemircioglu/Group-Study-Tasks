package week08;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String str = "Hello World"; // 5
        String str2 = " fly me to the moon "; // 4
        String str3 = "luffy is still joyboy"; // 6

        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord(str2));
        System.out.println(lengthOfLastWord(str3));
        System.out.println(lengthOfLastWord2(str));
        System.out.println(lengthOfLastWord2(str2));
        System.out.println(lengthOfLastWord2(str3));
        System.out.println(lengthOfLastWord3(str));
        System.out.println(lengthOfLastWord3(str2));
        System.out.println(lengthOfLastWord3(str3));
    }

    public static int lengthOfLastWord(String s) {

        String[] str = s.split(" ");
        String result = str[str.length - 1];
        return result.length();
    }

    public static int lengthOfLastWord2(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (r >= 0 && s.charAt(r) == ' ') {
            r--;
        }

        if (r == 0) {
            return 1;
        }
        //  Now, only characters left
        while (r >= 0 && s.charAt(r) != ' ') {
            r--;
            l++;
        }
        return l;
    }

    public static int lengthOfLastWord3(String s) {

        if (s.length() == 1) {
            return 1;
        }

        String result = s.trim();
        result = result.substring(result.lastIndexOf(" ") + 1, result.length());
        return result.length();
    }
}
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = " fly me to the moon " Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */
