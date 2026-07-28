import java .util.*;
public class inserctionSort {
    public static void main (String args[]){
        int arr[] = {5,4,3,2,1};
        for(int i=1;i<=arr.length-1; i++){
            int current = arr[i];
            int perv = i-1;
            while(perv>=0 && arr[perv]>current){
                arr[perv+1] = arr[perv];
                perv--;
            }
            arr[perv+1] = current;
        }
        System .out.print(Arrays.toString(arr));
    }
}
