import java.util.*;
public class reversstring {
    public static void revers  (String str ,int index){
        //base case
        if(index==str.length()){
            return;
        }
        revers(str,index+1);
        System.out.print(str.charAt(index));
    }
    public static void main  (String arr[]){
        String str = "shidou";
        revers(str,0);
    }
}
