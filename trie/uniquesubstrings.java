import java .util.*;
public class uniquesubstrings {
       static class Node{
    Node children[]=new Node[26];
    boolean eow=false;

    Node(){
        for(int i=0;i<26;i++){
            children[i]=null;
        }
    }
   }
   public static Node root=new Node();

   public static void insert(String word){
    Node current =root;
    for (int level=0 ;level<word.length();level++){
        int idx=word.charAt(level)-'a';
        if(current.children[idx]==null){
            current.children[idx]=new Node();
        }
        current=current.children[idx];
    }
    current.eow=true;
   }

   public static boolean search(String key){
    Node current =root;
    for (int level=0 ;level<key.length();level++){
        int idx=key.charAt(level)-'a';
        if(current.children[idx]==null){
            return false;
        }
        current=current.children[idx];
    }
  return  current.eow=true;
   }

   public static int countnodes(Node root){
    //base case
    if(root==null){
        return 0;
    }
    int count=0;
    for(int i=0;i<26;i++){
        if(root.children !=null){
        count +=countnodes(root.children[i]);
       }
   }
   return count+1;
   }


   public static void main (String[] args){
    String str = "ababa" ;

      //suffix insert in the tree
    for(int i=0; i<str.length();i++){
        String suffix =str.substring(i);
        insert(suffix);
    }
System .out.println(countnodes(root));

   }
}


