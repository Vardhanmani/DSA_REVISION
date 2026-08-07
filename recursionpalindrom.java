import java .util.*;
public class recursionpalindrom {
    public static boolean ispalindrome(String str , int start , int end){
        //base case
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return ispalindrome(str,start+1,end-1);
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.print(ispalindrome(str , 0 ,str.length()-1));
    }
}
