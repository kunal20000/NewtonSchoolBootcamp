package LinkedList;

public class linkedList {


// add a node and return a head of the linked list
    static Node addFirst( Node head, int data){
        Node temp = new Node(data);

        if(head==null){
            return temp;
        }
        else{
            temp.next=head;
            return temp;
        }

    }

    static Node addLast(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
            return head;
        }

    }

    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }

    }
}
