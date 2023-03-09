package LinkedList;

public class DeletionInDoublyLinkedList {
    public static Node deleteElement(Node head, int k){
        Node ptr1 = head;
        Node ptr2 = head;
        while(k--!=0){
            ptr2=ptr2.next;
        }
        while(ptr2!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        if(ptr1==null){
            return ptr1;
        }else if(ptr1==head){
            Node newNode = ptr1.next;
            if(ptr1.next!=null){
                ptr1.next.prev = null;
                ptr1.next=null;
            }
            return newNode;
        }else{
            ptr1.prev.next = ptr1.next;
            if(ptr1.next != null)
                ptr1.next.prev = ptr1.prev;
                ptr1.next = null;
                ptr1.prev = null;
                return head;


        }

    }


    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
}
