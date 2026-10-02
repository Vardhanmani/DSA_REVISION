class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentsum <0){
                currentsum = nums[i];
            }else{
                currentsum += nums[i];
            }
            maxsum = Math.max(currentsum , maxsum);
        }
        return maxsum;
    }
}