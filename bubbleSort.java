import java .util.*;
public class bubbleSort {
    public static void main(String args[]){
        int arr[] = {3,4,1,5,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
          System.out.print(Arrays.toString(arr));   
    }
}
