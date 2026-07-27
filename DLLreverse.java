import java.util.*;

public class DLLreverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverse(Node head) {
        Node pre = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre; 
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("==>"); 
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = reverse(head);
        printList(head);
    }
}