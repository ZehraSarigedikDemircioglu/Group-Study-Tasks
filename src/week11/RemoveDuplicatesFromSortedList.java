package week11;

public class RemoveDuplicatesFromSortedList {

    ListNode head;
    ListNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while(current != null) {
            if (current.next == null) {
                break;
            }
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    void add(int data) {
        // create a new node object from data
        ListNode node = new ListNode(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }
    void printNodes() {

        ListNode current = head;
        while (current != null) {
            if (current.next == null){
                System.out.println(current.val + "=> null");
            } else {
                System.out.print(current.val + "=> ");
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
        list.add(1);
        list.add(1);
        list.add(2);

        list.printNodes(); // 1=> 1=> 2=> null
        System.out.println(list.deleteDuplicates(list.head)); // 1=> 2=> null


        RemoveDuplicatesFromSortedList list2 = new RemoveDuplicatesFromSortedList();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);

        list2.printNodes(); // 1=> 1=> 2=> 3=> 3=> null
        System.out.println(list.deleteDuplicates(list.head)); // 1=> 2=> 3=> null
    }
}
/*
You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
Write a function that returns a modified version of the Linked List that doesn't contain any nodes with
duplicate values. The Linked List should be modified in place (i.e., you shouldn't create a brand-new list),
and the modified Linked List should still have its nodes sorted with respect to their values. Each LinkedList
node has an integer value as well as a next node pointing to the next node in the list or to None / null
if it's the tail of the list.
     Example:
     Input: 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 // the head node with value 1
     Output: 1 -> 3 -> 4 -> 5 -> 6 // the head node with value 1
 */
