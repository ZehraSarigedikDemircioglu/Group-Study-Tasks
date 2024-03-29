package week10.DeleteNNodesAfterMModes;


public class DeleteNodeApp {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        for (int i = 1; i <= 13 ; i++) {
            list.add(new Node(i));
        }

        list.printNodes(); // 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> 10=> 11=> 12=> 13=> null
        list.deleteNNodesAfterMModes(2, 3);
        list.printNodes(); // 1=> 2=> 6=> 7=> 11=> 12=> null

        LinkedList list2 = new LinkedList();

        for (int i = 1; i <= 11 ; i++) {
            list2.add(new Node(i));
        }

        list2.printNodes(); // 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> 10=> 11=> null
        list2.deleteNNodesAfterMModes(1, 3);
        list2.printNodes(); // 1=> 5=> 9=> null
    }
}
