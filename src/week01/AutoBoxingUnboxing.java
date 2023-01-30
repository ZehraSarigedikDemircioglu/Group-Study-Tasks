package week01;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        // Autoboxing : Primitive => Wrapper Class
        // Unboxing : Wrapper Class => Primitive

        byte a = 10;
        Byte b = a;
        System.out.println("b = " + b); // b = 10, autoboxing

        Double d = 2.5;
        double x = d;
        System.out.println("x = " + x); // x = 2.5, unboxing
    }

}
