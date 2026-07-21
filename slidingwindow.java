import java .util.*;
public class slidingwindow {
        public static void sliding(int arr[],int k){
            int maxsum = 0;
            int slidingWindow = 0;
            for(int i=0;i<=k-1;i++){
                slidingWindow += arr[i];
            }
            for(int i=k; i<arr.length ; i++){
                slidingWindow = slidingWindow + arr[i]-arr[i-k];
                if(slidingWindow > maxsum){
                    maxsum = slidingWindow;
                }
            }
            System.out.print(maxsum);
        }
    public static void main (String args[]){
        int arr[] = {2,1,5,1,3,2};
        
        sliding(arr, 3);
}
}