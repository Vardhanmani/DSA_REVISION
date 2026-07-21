import java .util.*;
public class missingno{
    public static void main(String args[]){
        int arr[] ={1,2,3,4,6};
        int n = 6;
        int totalsum = 0;
        int sum = 0;
        for(int i=1;i<= n;i++){
            totalsum += i;
        }
        for(int i=0; i<=arr.length-1; i++){
            sum += arr[i];
        }
        int ans = totalsum - sum;
        System.out.print(ans);
    }
}