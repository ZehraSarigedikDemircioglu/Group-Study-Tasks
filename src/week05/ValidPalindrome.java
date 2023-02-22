package week05;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Do geese see God")); // True
        System.out.println(isPalindrome("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome("A brown fox jumping over")); // False
    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        int r = 0;
        int l = str.length() - 1;

        while (r < l) {

            if (str.charAt(r) > 'a' || str.charAt(l) < 'z') {
                r++;
            } else if (str.charAt(l) < 'a' || str.charAt(l) > 'z') {
                l--;
//            } else if(str.charAt(r) == str.charAt(l)){
//                r++;
//                l--;
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
