import java.util.*;
public class stockdays {
    public static void main (String args[]){
        int arr[] = {3,2,5,4,7};
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
                count++;
            }
        }        
        System.out.println(count);

    }
}
