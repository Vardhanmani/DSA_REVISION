import java.util.*;

public class LCA {
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
    public static Node LowestCA(Node root, Node p, Node q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }
        
        Node left = LowestCA(root.left, p, q);
        Node right = LowestCA(root.right, p, q);
        
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        
        return root; 
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        Node result = LowestCA(root, root.left.left, root.right);
        if (result != null) {
            System.out.print(result.data);
        }
    }
}