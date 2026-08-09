import java.util.*;
public class recursionsubstring{
    public static void substring(String str, int index , String newstring){
        if(index == str.length()){
            System.out.print(newstring + " ");
            return;
        }
        char currChar = str.charAt(index);
        substring(str , index+1,newstring + currChar);
        substring(str , index +1 , newstring);
    }
    public static void main(String[] args) {
        String str = "abc";
        substring(str, 0, "");
    }
}