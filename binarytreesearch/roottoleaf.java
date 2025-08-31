import java.util.*;
import java.util.ArrayList;

public class roottoleaf {
     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
        
    }
    public static Node insert(Node root,int value){
        //base case
        if(root== null){
           root=new Node(value);
           return root;
        }
        //if root not=null
        //root>value insert left
        if(root.data>value){
            root.left=insert(root.left, value);
        }
        else{//root<value inseart right
            root.right=insert(root.right, value);
        }
        return root;
    }
    public static void inorder(Node root){
        //base case
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printroottoleaf(Node root,ArrayList<Integer>path){
        //base case
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null &&root.right==null){
            printpath(path);
        }
        printroottoleaf(root.left, path);
        printroottoleaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size(); i++){
            System.out.print(path.get(i)+ " ");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7,9,8};
         Node root=null;

        for(int i=0; i<value.length;i++){
            root=insert(root,value [i]);
        }
        inorder(root);
        System.out.println();

        printroottoleaf(root, new ArrayList<>());
    }
    
}
