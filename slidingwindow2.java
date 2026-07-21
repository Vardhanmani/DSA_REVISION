import java .util.*;
public class slidingwindow2 {
    public static void slidwindow(int arr[], int target){
        int left = 0;
        int currentsum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            currentsum += arr[i];
            while(currentsum >= target){
                if((i-left+1)<min){
                    min = i-left+1;
                }
                currentsum -=arr[left];
                left++;
            }
        }
        System.out.print(min);
    }
    public static void main (String args[]){
        int arr[] = {2,3,1,2,4,3};
        slidwindow(arr , 7);
    }
}
