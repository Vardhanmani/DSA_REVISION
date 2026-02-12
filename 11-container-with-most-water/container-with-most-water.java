class Solution {
    public int maxArea(int[] n) {
        int leftpointer = 0;
        int rightpointer = n.length-1;
        int maxwater = Integer.MIN_VALUE;
        while(leftpointer < rightpointer){
            int width = rightpointer - leftpointer;
            int height = Math.min(n[leftpointer],n[rightpointer]);
            int answer = height*width;
            if(answer > maxwater){
                maxwater = answer;
            }else{
                answer = maxwater;
            }
            if(n[leftpointer]<n[rightpointer]){
                leftpointer++;
            }else{
                rightpointer--;
            }
        }
        return maxwater;
    }
}