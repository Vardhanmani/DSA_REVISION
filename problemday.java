import java . util.*;
public class problemday {
    public static boolean sorted (int arr[] , int index){
        //base cases
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false; 
        }
        return sorted(arr, index+1);
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,4,4,5,5};
        System.out.println(sorted(arr,0));
    }
}
