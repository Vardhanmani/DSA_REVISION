import java.util.*;
public class binarysearch3 {
    public static int minimum(int arr[] ,int start,int end){
        if(start == end){
            return arr[start];
        }
        int mid = start +(end-start)/2;
        if(arr[mid]>arr[end]){
            return minimum(arr,mid+1,end);
        }else{
            return minimum(arr,start,mid);
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,1,2};
        int min = minimum(arr,0,arr.length-1);
        System.out.print(min);
    }
}
