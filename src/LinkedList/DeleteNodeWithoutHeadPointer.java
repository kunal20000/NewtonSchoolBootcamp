package LinkedList;

public class DeleteNodeWithoutHeadPointer {

    public static void deleteNode(Node D){
        Node nextNode = D.next;
        D.val = nextNode.val;
        D.next = nextNode.next;
    }
}
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
