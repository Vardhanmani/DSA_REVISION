import java.util.*;
public class binarysearch6 {
    public static boolean canfinish (int[] piles, int k,int h){
        long totalHours = 0;
        for(int pile : piles){
            totalHours += (pile + k-1)/k;
        }
        return totalHours <= h;
    }
    public static int minspeed (int piles[],int h){
        int start = 1;
        int end = 0;
        for(int pile : piles){
            end = Math.max(end,pile);
        }
        int ans = end; //11
        while (start<=end){
            int mid = start+(end-start)/2;
            if(canfinish(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        
        int result = minspeed(piles, h);
        System.out.println("Minimum eating speed (k): " + result);
    }
}
