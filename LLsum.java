import java.util.*;
public class LLsum {
    static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        Node current = head;
        int sum = 0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }
        System.out.print(sum);
    }
}
