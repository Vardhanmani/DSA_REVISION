import java.util.*;
public class BinarySearch1 {
    public static int firstvalue(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target == arr[mid]){
            int left = firstvalue(arr,target,start,mid-1);
            return (left !=-1)?left : mid;
        }
        else if(target < arr[mid]){
            return firstvalue(arr,target,start,mid-1);
        }
        else{
            return firstvalue(arr,target,mid+1,end);
        }
    }
    public static int secondvalue(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target == arr[mid]){
            int right = secondvalue(arr,target,mid+1,end);
            return (right !=-1)?right : mid;
        }
        else if(target < arr[mid]){
            return secondvalue(arr,target,start,mid-1);
        }
        else{
            return secondvalue(arr,target,mid+1,end);
        }
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,3,4,5,5,6,6};
        int result1 = firstvalue(arr,3,0,arr.length-1);
        int result2 = secondvalue(arr,3,0,arr.length-1);
        System.out.print("[" + result1 + " " + result2 + "]");
    }
}
