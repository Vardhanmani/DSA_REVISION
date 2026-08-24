import java.util.*;
public class diamater {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    static int maxs ;
    public static int diamaters(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int left = diamaters(root.left);
        int right = diamaters(root.right);
        int current = left+right;
        maxs = Math.max(maxs,current);
        return Math.max(left,right)+1;
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        diamaters(root);
        System.out.println(maxs);
        System.out.print(maxs);
    }
}
