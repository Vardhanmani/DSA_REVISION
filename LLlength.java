import java.util.*;
public class LLlength {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main (String args[]){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        
        head.next= second;
        second.next = third;
        third.next = four;
        four.next = five;
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current  = current.next;
        }
        System.out.print(count);
    }
}
