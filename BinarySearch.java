import java.util.*;
public class BinarySearch {
    public static int search(int arr[], int target,int start, int end){
          if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
           return search(arr,target,start,mid-1);
        }
        else{
           return search(arr,target,mid+1,end);
        }
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,4,5};
        int result = search(arr,4,0,arr.length-1);
        System.out.println(result);
    }
}
