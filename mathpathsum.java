import java.util.*;
public class mathpathsum {
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
    static int max = 0;
    public static int maxsum(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int leftsum = Math.max(0,maxsum(root.left));
        int rightsum = Math.max(0,maxsum(root.right));
        int current = leftsum + rightsum + root.data;
        max = Math.max(max , current);

        return root.data + Math.max(leftsum , rightsum);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        maxsum(root);
        System.out.print(max);
    }
}
