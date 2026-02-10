import java.util.Arrays;
class Solution {
    public int maxProfit(int[] n) {
        int BP = Integer.MAX_VALUE;
        int SP = 0;
        for(int i=0;i<n.length;i++){
            if(BP>n[i]){
                BP=n[i];
            }else{
                int profit = n[i]-BP;
                if(profit>SP){
                    SP=profit;
                }
            }
        }
        return(SP);
    }
}