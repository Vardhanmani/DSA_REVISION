import java .util.*;
public class countingNodes{
static class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
    public static int  countnode(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int count1 = countnode(root.left);
        int count2 = countnode(root.right);
        return count1 + count2 + 1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print(countnode(root));
    }
}