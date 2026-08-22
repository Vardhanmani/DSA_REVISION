import java.util.*;
public class maxNodes {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int maxnodes(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int lefts = maxnodes(root.left);
        int rights = maxnodes(root.right);
        
        return Math.max(lefts,rights)+1;
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print(maxnodes(root));
    }
}
