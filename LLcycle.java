import java.util.*;
public class LLcycle {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this . data = data;
            this . next = null;
        }   
    }
    public static boolean cycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }    
        }
        return false;
    }
    public static void main(String args[]){
       Node ex1_head = new Node(3);
        Node ex1_node2 = new Node(2);
        Node ex1_node0 = new Node(0);
        Node ex1_node4 = new Node(-4);

        ex1_head.next = ex1_node2;
        ex1_node2.next = ex1_node0;
        ex1_node0.next = ex1_node4;
        ex1_node4.next = ex1_node2;

        System.out.println("Example 1: " + cycle(ex1_head));

        Node ex2_head = new Node(1);
        ex2_head.next = new Node(2);

        System.out.println("Example 2: " + cycle(ex2_head));
    }
}
