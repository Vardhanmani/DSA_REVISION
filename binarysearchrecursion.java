import java.util.*;
public class binarysearchrecursion {
    public static int binary(int arr[] , int target , int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + ( end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
           return binary(arr ,target, start , mid-1);
        }
        return binary(arr, target, mid+1, end);
    }
    public static void main (String [] args){
        int arr[] = {1,2,3,4,5,6};
        int result = binary(arr, 5,0,arr.length-1);
        System.out.println(result);
    }
}
