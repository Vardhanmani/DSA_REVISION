import java .util.*;
public class stringConversion {
    public static int StringConversion(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];

                }
                else{
                    int add=dp[i][j-1]+1;
                    int delete=dp[i-1][j]+1;
                    dp[i][j]=Math.min(add, delete);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="mani";
        String str2="moni";
        System.out.println(StringConversion(str1, str2));
    }
}
