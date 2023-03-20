package LinkedList;

public class Add1NumberInLinkedList
{

    static Node addOne(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node temp = null;
        int carry = 1;

        while(curr!=null)
        {
            int sum = carry + curr.data;
            carry = (sum >= 10) ? 1:0;
            curr.data = sum%10;
            temp = curr;
            curr = curr.next;

        }
        if(carry > 0)
        {
            Node newNode = new Node(carry);
            temp.next = newNode;
        }
        return head;

    }




    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
