import java.util.*;
public class recursionsum {
    public static int sum(int n){
        //base case
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main (String[] args){
        int n=9;
        int totalsum = sum(n);
        System.out.print(totalsum);
    }
}
