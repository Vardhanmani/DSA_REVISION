import java.util.*;
public class QuickSort {
    public static int pratictions(int arr[] , int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void Quicksort(int arr[],int low,int high){
        if(low<high){
            int sort = pratictions(arr ,low , high);
            Quicksort(arr,low,sort-1);
            Quicksort(arr,sort+1,high);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
