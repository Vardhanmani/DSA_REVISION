import java.util.ArrayList;

public class convetBSTtobalanceBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
        
    }public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root,ArrayList<Integer> inorder){
        //base case
        if(root==null){
            return ;
        }

        inorder(root.left,inorder);
        inorder.add(root.data);
        inorder(root.right,inorder);
    }
    public static Node createbst(ArrayList<Integer> inorder,int si,int end){
        if(si>end){
            return null;
        }
        int mid =(si+end)/2;
        Node root =new Node(inorder.get(mid));
        root.left=createbst(inorder, si, mid-1);
        root.right=createbst(inorder, mid+1, end);
        return root;
    }
    public static Node balancebst(Node root){
        //inorder
        ArrayList<Integer>inorder=new ArrayList<>();
        inorder(root,inorder);
        //sorted to balanceBST 
        root=createbst(inorder, 0, inorder.size()-1);
        return root;

    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=balancebst(root);
        preorder(root);

    }
    
}
