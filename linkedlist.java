public // package linkedList;

// import java.util.LinkedList;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class newOne {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;

            if(head==null){
                head=tail=new Node;
                return;
            }
        }
    }
    public static Node head;
    public static Node tail;
    
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);

        // System.out.println( ll.head);
        // System.out.println(ll.head.next);

    }
} {
    
}
