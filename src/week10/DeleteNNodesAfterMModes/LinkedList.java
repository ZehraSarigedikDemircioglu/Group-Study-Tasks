package week10.DeleteNNodesAfterMModes;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {

        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNodes() {

        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.data + "=> null");
            } else {
                System.out.print(current.data + "=> ");
            }
            current = current.next;
        }
    }

    void deleteNNodesAfterMModes(int n, int m) {

        Node prev = head;
        Node current = head;

        while (current != null) {

            for (int i = 1; i <= m; i++) { // skip m nodes
                prev = current;
                current = current.next;
            }

            if (current == null) {
                return;
            }
            for (int i = 1; i <= n; i++) { // to remove n-times
                prev.next = current.next;
                current.next = current.next;
                size--;
            }
        }
    }
}