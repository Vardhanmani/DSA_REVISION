import org.w3c.dom.Node;

public class valideBST {
   
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
    public static boolean isvalide(Node root , Node min,Node max){
       if(root==null){
          return true;
       }
       if(min !=null && root.data<=min.data){
        return false;
       }
       else if(max != null && root.data>=max.data){
        return false;
       }
       //check left side and right side
       return isvalide(root.left, min, root) && isvalide(root.right, root, max);
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7,9,8};
         Node root=null;

        for(int i=0; i<value.length;i++){
            root=insert(root,value [i]);
        }
        inorder(root);
        System.out.println();

        if(isvalide(root, null, null)){
            System.out.println("is valide");
        }
        else{
            System.out.println("not valide");
        }
    }
    
}
