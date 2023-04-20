package week10.DeleteNNodesAfterMModes;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(Node node) {

//        Node node = new Node(data);

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

    void deleteNNodesAfterMModes(int m, int n) {

        // Keep the first m nodes starting with the current node.
        // Remove the next n nodes

        Node current = head;
        Node lastM = head;

        while (current != null) {

            int mCount = m, nCount = n;

            while (current != null && mCount != 0) { // traverse m nodes
                lastM = current;
                current = current.next;
                mCount--;
            }

            while (current != null && nCount != 0) { // traverse n nodes
                current = current.next;
                nCount--;
            }
            lastM.next = current; // delete n nodes
        }
        System.out.println(head);
    }
}