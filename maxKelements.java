import java.util.Arrays;

public class maxKelements {
    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int[][] freqList = new int[nums.length][2];
        int uniqueCount = 0;
        int i = 0;
        while (i < nums.length) {
            int currentNum = nums[i];
            int count = 0;
            while (i < nums.length && nums[i] == currentNum) {
                count++;
                i++;
            }
            
            freqList[uniqueCount][0] = currentNum; // The number
            freqList[uniqueCount][1] = count;      // Its frequency
            uniqueCount++;
        }
        Arrays.sort(freqList, (a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            result[j] = freqList[j][0];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans)); 
    }
}