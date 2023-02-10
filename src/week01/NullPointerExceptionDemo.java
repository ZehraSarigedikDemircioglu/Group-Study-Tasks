package week01;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println(str.charAt(0));
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

}
