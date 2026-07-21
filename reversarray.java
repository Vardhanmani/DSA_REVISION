import java .util.*;
public class reversarray {
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        for(int i=start; i<end;i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
