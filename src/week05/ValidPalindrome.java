package week05;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Do geese see God")); // True
        System.out.println(isPalindrome("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome("A brown fox jumping over")); // False
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // True
        System.out.println(isPalindrome("race a car")); // False
    }

    public static boolean isPalindrome(String str) {
        String s = str.replaceAll(",", " ");
        s = s.replaceAll(":", " ");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        int r = 0;
        int l = s.length() - 1;

        while (r < l) {

            if (!(s.charAt(r) >= 'a' && s.charAt(l) <='z')) {
                r++;
            } else if ((s.charAt(l) <= 'a' && s.charAt(l) >= 'z')) {
                l--;
            } else if(s.charAt(r) == s.charAt(l)){
                r++;
                l--;
            }else {
                return false;
            }
        }
        return true;
    }
}
/*
Write a function that accepts a string and determines whether it is a palindrome, ignoring
non-alphanumeric characters and case and returns true if it is palindrome.
 */
