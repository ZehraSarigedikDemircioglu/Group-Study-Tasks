package week05;

public class ValidPalindrome3 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Do geese see God")); // True
        System.out.println(isPalindrome("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome("A brown fox jumping over")); // False
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // True
        System.out.println(isPalindrome("race a car")); // False
    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
