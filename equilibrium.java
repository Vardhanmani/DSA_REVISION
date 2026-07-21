import java .util.*;
public class equilibrium{
    public static void eqlsum(int[] arr){
        int leftsum = 0;
        int totalsum = 0;
        for(int i=0; i<=arr.length-1; i++){
            totalsum +=arr[i];
        }
        int rightsum = totalsum;
        for(int i=0; i<=arr.length-1 ; i++){
            if(rightsum != leftsum){
                rightsum -= arr[i];
            }
            if(rightsum == leftsum){
                System.out.println(i);
                return;
            }
            leftsum +=arr[i];
        }
        System.out.println(-1);
    }
    public static void main(String args[]){
        int arr[] = {1,7,3,6,5,6};
        eqlsum(arr);
    }
}