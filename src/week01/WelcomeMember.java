package week01;

public class WelcomeMember {

    public static void main(String[] args) {

        String[] arr= {"John", "Smith"};
        sayHello(arr, "Phoenix", "Arizona");
    }

    private static void sayHello(String[] arr, String city, String state){

        String result = "";

        System.out.print("Hello, ");

        for (String each : arr) {
            result += each + " ";
        }
        System.out.print(result.trim());


        System.out.print("! Welcome to " + city + ", " + state + "!");

    }
}

/*
*
        String[] arr= {"John", "Smith"};
        String[][] arr2= {arr, {"Phoenix"}, {"Arizona"}};
        for (String[] each2D : arr2) {
            for (String each1D : each2D) {
                System.out.print(each1D + " ");
            }
        }

 */
