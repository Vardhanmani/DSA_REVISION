import java.util.*;

public class LLrevers {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;

        
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;     
            current = next;      
        }
        head = prev; 

        
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data);
            if (tempNode.next != null) {
                System.out.print("->"); 
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}