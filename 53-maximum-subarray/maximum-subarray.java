class Solution {
    public int maxSubArray(int[] n) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<n.length;i++){
            currsum=currsum+n[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return (maxsum);
    }
}