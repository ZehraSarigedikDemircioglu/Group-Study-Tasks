package week01;

public class NullPointerException {

    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.charAt(0));
        }catch (java.lang.NullPointerException e){
            e.printStackTrace();
        }

    }

}
