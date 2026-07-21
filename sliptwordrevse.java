import java.util.*;
public class sliptwordrevse {
    public static void main (String args[]){
        String str = "welcome TO Java";
        String strs[] = str.split(" ");
        for(int i=strs.length-1; i>=0;i--){
            System.out.print(strs[i]+" ");
        }
    }
}
