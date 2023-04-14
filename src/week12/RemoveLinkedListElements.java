package week12;

public class RemoveLinkedListElements {

    ListNode head;
    ListNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
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

    ListNode removeElements(ListNode head, int val) {

        ListNode current = head;

        if (head == null) return null;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

        RemoveLinkedListElements list = new RemoveLinkedListElements();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.printNodes(); // 1=> 2=> 6=> 3=> 4=> 5=> 6=> null
        System.out.println(list.removeElements(list.head, 6)); // 1=> 2=> 3=> 4=> 5=> null

        RemoveLinkedListElements list2 = new RemoveLinkedListElements();


        list2.printNodes(); // null
        System.out.println(list2.removeElements(list.head, 1)); // null

        RemoveLinkedListElements list3 = new RemoveLinkedListElements();
        list3.add(7);
        list3.add(7);
        list3.add(7);
        list3.add(7);

        list3.printNodes(); // 7=> 7=> 7=> 7=> null
        System.out.println(list3.removeElements(list.head, 7)); // null
    }
}
/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that
has Node.val == val, and return the new head.
 */
