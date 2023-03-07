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

    static Node removeNode(Node head, Node node){
        if(node==head){
            head=head.next;
            node.next=null;

        }else{
            //find one node to previous node
            Node ptr=head;
            while(ptr.next!=node){
                ptr=ptr.next;
            }
            ptr.next=node.next;
            node.next=null;
        }
        return head;
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
