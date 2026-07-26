import java . util .*;
public class LLpalindrom {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main (String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while(current != null){
            list.add(current.data);
            current = current.next;
        }
        int start = 0;
        int last = list.size()-1;
        boolean isPalindrom = true;
        while (start <last){
            if(!list.get(start).equals(list.get(last))){
                isPalindrom = false;
                break;
            }
            start++;
            last--;
        }
        System .out.print(isPalindrom);
    }    
}
