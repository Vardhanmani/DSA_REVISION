import java .util.*;
public class KnapsackTabulation {
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int Knapsack(int val[],int wt[],int w){
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1];
                int W=wt[i-1];
                if(W<=j){//valid
                  int includeprofit =v+dp[i-1][j-W];
                  int notincludeprofit=dp[i-1][j];
                  dp[i][j]=Math.max(includeprofit, notincludeprofit);

                }
                else{
                    int notincludeprofit=dp[i-1][j];
                    dp[i][j]=notincludeprofit;
                }
            }
        }
        print(dp);
        return dp[n][w];
    }
    public static void main(String[] args) {
        
    

     int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int dp[][]=new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(Knapsack(val, wt, w));
   }
}
