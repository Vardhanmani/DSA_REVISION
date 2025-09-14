import java .util.*;
public class insertanddeleteintrie{
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

   

   public static void main (String[] args){
    String word[]={"the","a","there", "their","any"};


    for(int i=0; i<word.length;i++){
        insert(word[i]);
    }
System .out.println(search("there"));

   }
}
