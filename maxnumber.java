import java.util.*;
public class maxnumber {
    public static void main(String args[]){
        int arr[] = {2,3,7,4,8,3};
        int maxno = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>maxno){
                maxno=arr[i];
            }
        }
        System.out.print(maxno);
    }
}
