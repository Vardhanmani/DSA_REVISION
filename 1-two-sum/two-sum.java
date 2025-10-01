 import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int total = nums[i] + nums[j];
                if (total == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        Solution sol=new Solution();

        int[] result =sol. twoSum(nums, target);
        

        System.out.print(Arrays.toString(result));
    }
}