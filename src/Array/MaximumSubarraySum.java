package Array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0]; // Initialize maximum sum ending at current index
        int maxSoFar = nums[0]; // Initialize maximum sum so far

        // Iterate through the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // Update maximum sum ending at current index
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            // Update maximum sum so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

