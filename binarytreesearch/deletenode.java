
public class deletenode{
static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
        
    }public static Node insert(Node root,int value){
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
    public static boolean search(Node root ,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right, key);
        }
    }
     public static Node delete(Node root ,int value){
        //search right delete node
        if(root.data<value){
            root.right=delete(root.right, value);
        }
        //search left delete node
        else if(root.data>value){
            root.left=delete(root.left, value);
        }
        //rootdata == value then delete
        //case 1 = no child
        else{
            if (root.left==null && root.right==null) {
                return null;
            }
            //case 2 have one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3 have both child
            //first find out IS
            Node IS =findoutinordersuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
     }
     public static Node findoutinordersuccessor(Node root){//print all values
     while ((root.left !=null)) {
        root=root.left;
     }
     return root;
     }
     public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
         for(int i=0; i<value.length;i++){
            root=insert(root,value [i]);
        }
        inorder(root);
        System.out.println(" ");
        delete(root, 1);
        System.err.println();

        inorder(root);
     }
}