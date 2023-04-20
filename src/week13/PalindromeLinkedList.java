package week13;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeLinkedList {

    public static void main(String[] args) {

        LinkedListApp list = new LinkedListApp();
        Stream.of(1, 2, 2, 1).forEach(list::add);
//        System.out.println(stream.collect(Collectors.toList()));
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(1);
        list.printListNode();

        System.out.println(list.isPalindrome(list.head)); // true

        LinkedListApp list2 = new LinkedListApp();
        list2.add(1);
        list2.add(2);
        System.out.println(list2.isPalindrome(list2.head)); // false
    }
}
