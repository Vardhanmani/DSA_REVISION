import java .util.*;
public class meargesortrecursion {
    public static void divided (int arr[] , int start , int end){
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        divided(arr, start, mid);
        divided(arr, mid+1, end);
        conquer(arr, start,mid,end);
    }
    public static void conquer(int arr[] , int start, int mid, int end){
        int merge[] = new int [end - start + 1];

        int dx1 = start;
        int dx2 = mid+1;
        int x = 0;
        while(dx1 <= mid && dx2 <= end){
            if(arr[dx1]<=arr[dx2]){
                merge[x++] =arr[dx1++];
            }else{
                merge[x++] = arr[dx2++];
            }
        }
         while (dx1 <= mid) {
            merge[x++] = arr[dx1++];
        }
        while (dx2 <= end) {
            merge[x++] = arr[dx2++];
        }
        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }
     public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        divided(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); 
    }
}
