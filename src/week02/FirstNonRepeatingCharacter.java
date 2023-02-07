package week02;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "abcabcdef";

        for(Character ch : str.toCharArray()) {
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeat character: " + ch);
                break;
            }
        }
    }
}

