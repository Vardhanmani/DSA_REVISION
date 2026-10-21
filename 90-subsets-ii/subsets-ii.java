class Solution {
    public void backtracking (int []nums , int start , List<Integer>SC , List<List<Integer>>result){
        result.add(new ArrayList<>(SC));
        for(int i=start;i<nums.length ; i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            SC.add(nums[i]);
            backtracking(nums , i+1 , SC , result);
            SC.remove(SC.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums ) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums , 0, new ArrayList<>() ,result);
        return result;
    }
}