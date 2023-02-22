package week05;

public class String_vs_StringBuilder_StringBuffer {

    public static void main(String[] args) {

        String str = "Wooden";
        str = str.concat(" Spoon"); // String is immutable so we need to assign back to str
        System.out.println(str); // create two ways 1) by String literal  2) by new keyword

        System.out.println("-------------------------------------------------");

        StringBuilder strBuilder = new StringBuilder("Wooden");
        strBuilder.append(" Spoon"); // StringBuilder is mutable, not thread-safe, not synchronized
        System.out.println(strBuilder); // create only one way by new keyword

        System.out.println("-------------------------------------------------");

        StringBuffer strBuffer = new StringBuffer("Wooden");
        strBuffer.append(" Spoon"); // StringBuffer is mutable, synchronized so slower
        System.out.println(strBuffer); // create only one way by new keyword
    }
}
