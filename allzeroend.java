 import java . util . * ;
public class allzeroend {
    public static void zero (int arr[]){
        int Index =0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[Index];
                arr[Index] = temp;
                Index++;
            }
        }
        System .out .println (Arrays.toString(arr));
    }
    public static void main (String args[]){
        int arr[] = {0,1,0,3,0,12};
        zero(arr);
    }
}
 
