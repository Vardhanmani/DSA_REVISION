import java.util.*;
public class printbinaryno {
    public static void binarynumber(int arr[] , int index){
        //base case
        if(index == arr.length){
            System.out.print(Arrays.toString(arr));
            return;
        }
        for(int i=0; i<=1;i++){
            arr[index] = i;
            binarynumber(arr,index+1);
            arr[index] = 0;
        }
    }
    public static void main(String argd[]){
        int arr[] = new int[2];
        binarynumber(arr,0);
    }
}
