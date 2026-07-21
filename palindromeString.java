import java. util.*;
public class palindromeString {
    public static boolean palindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        for(int i=start;i<=end;i++){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]){
        String str = "Radar";
       System.out.println(palindrome(str));
    } 
}
