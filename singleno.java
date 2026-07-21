import java .util.*;
public class singleno {
    public static void main (String args[]){
        int arr[]= {4,3,2,1,2,3,4};
        int x = 0;
        for(int i=0; i<=arr.length-1;i++){
            x = x^arr[i];
        }
        System.out.println(x);
    }
}
