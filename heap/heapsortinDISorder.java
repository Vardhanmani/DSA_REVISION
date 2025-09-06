import java.util.*;
public class heapsortinDISorder {
     public static void heapify(int arr[],int i, int size){
        int left= 2*i+1;
        int right=2*i+2;
        int minidx=i;

        if(left<size && arr[left]<arr[minidx]){
            minidx=left;
        }

        if(right<size && arr[right]<arr[minidx]){
            minidx=right;
        }

        if(minidx != i){
            //swap
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
            heapify(arr, minidx, size);
        }
    } 
    public static void heapsort(int arr[]){
        //build max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
           heapify(arr, i, n);
        }
        //push the firstnode to last node
        for(int i=n-1;i>0;i--){
            //swap last with first
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapsort(arr);

        //for all elements
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


