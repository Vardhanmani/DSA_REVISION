import java.util.*;
import java.util.Stack;
public class stackstringrevers{
    public static String revers (String str){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<=str.length()-1; i++){
            st.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
    public static void main (String args[]){
        String str = "fuckyou";
        String ans = revers(str);
        System.out.println(ans);
    }
}