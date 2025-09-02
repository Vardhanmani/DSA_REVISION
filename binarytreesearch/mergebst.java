import java.util.ArrayList;

public class mergebst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
        
    }
    public static void inorder(Node root , ArrayList<Integer>arr){
         
        //base case
        if(root==null){
            return ;
        }

        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }

    
    public static Node createbst(ArrayList<Integer> arr,int si,int end){
        if(si>end){
            return null;
        }
        int mid =(si+end)/2;
        Node root =new Node(arr.get(mid));
        root.left=createbst(arr, si, mid-1);
        root.right=createbst(arr, mid+1, end);
        return root;
    }
    public static Node mergebst(Node root1, Node root2){
        //inorder sequence for root 1
        ArrayList<Integer>arr1 =new ArrayList<>();
        inorder(root1, arr1);

        //inorder sequence for root2
        ArrayList<Integer>arr2 =new ArrayList<>();
        inorder(root2, arr2);

        //merge two
        int i=0; 
        int j=0;
        ArrayList<Integer>finalarr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
            finalarr.add(arr1.get(i));
            i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()){
             finalarr.add(arr2.get(j));
                j++;
        }
        return createbst(finalarr, 0, finalarr.size()-1);

    } 
    public static void preorder(Node root ){
         
        if(root==null){
            return ;
        }
        
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    
    }
    public static void main(String[] args) {
         Node root1=new Node(2);
        root1.left=new Node(1);
         root1.right=new Node(4);

         Node root2=new Node(9);
        root2.left=new Node(3);
         root2.right=new Node(12);
         Node root =mergebst(root1, root2);
         preorder(root);
    }
    
}
