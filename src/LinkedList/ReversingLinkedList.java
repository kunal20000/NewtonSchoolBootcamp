package LinkedList;

public class ReversingLinkedList {
 public static Node reverseLinkedList(Node head){
     Node prev = null , curr = head, next=null;
     while(curr!=null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
     }
     return prev;
 }

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
