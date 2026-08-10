import java.util.*;
public class backtracking {
    public static void findingpermutations(String str , String perm){
        //base case
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        //travelling to each char
        for(int i=0 ;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findingpermutations(newStr , perm+ch);
        }
    }  
    public static void main(String args[]){
        String str = "abc";
        findingpermutations(str,"");
    }
}
