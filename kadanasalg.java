import java.util.*;
public class kadanasalg{
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Stores the overall max sum
        int currSum = 0;                 // Stores sum of current window

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // Update maxSum if currSum is greater
            maxSum = Math.max(maxSum, currSum);

            // If currSum goes below 0, reset it back to 0
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum is: " + maxSubarraySum(arr)); // Output: 6
    }
}