public class rangeinbst {
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
    public static void range(Node root,int k1,int k2){
        if(root==null){
            return ;
        }
        if(root.data>=k1 && root.data<=k2){
            range(root.left, k1, k2);
            System.out.print(root.data + " ");
            range(root.right, k1, k2);
        }
        else if(root.data<k1){
            range(root.left, k1, k2);
        }
        else{
            range(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int value[]={ 8,5,3,1,4,6,10,11,14};
        Node root=null;
         for(int i=0; i<value.length;i++){
            root=insert(root,value [i]);
        }
        inorder(root);
        System.out.println();
        range(root, 5, 12);
    }
    
}
