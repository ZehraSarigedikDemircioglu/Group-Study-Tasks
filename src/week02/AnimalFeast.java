package week02;

public class AnimalFeast {

    public static void main(String[] args) {

        System.out.println(feast("chickadee", "chocolate cake")); // true
        System.out.println(feast("bear", "banana")); // false
        System.out.println(feast("great blue heron", "garlic naan")); // true


    }

    private static boolean feast(String animal, String food){


        if(animal.charAt(0) == food.charAt(0) && animal.charAt(animal.length()-1) == food.charAt(food.length()-1)){
            return true;
        }else{
            return false;
        }

        /*

        if(animal.substring(0,1) == food.substring(0,1)
                && animal.substring(animal.length()-1, animal.length()) == food.substring(food.length()-1, food.length())){
            return true;
        }else{
            return false;
        }

         */
    }
}

/*
All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the
dish must start and end with the same letters as the animal's name. For example, the great
blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

Write a method that takes the animal's name and dish as arguments and returns true or
false to indicate whether the beast is allowed to bring the dish to the feast.

Assume that beast and dish are always lowercase strings, and that each has at least two
letters. Beast and dish may contain hyphens and spaces, but these will not appear at the
beginning or end of the string. They will not contain numerals.

 */
