package Array;

public class MaximumSubarraySumWithSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printMaxSubarray(nums);
    }

    public static void printMaxSubarray(int[] nums) {
        int maxEndingHere = nums[0]; // Initialize maximum sum ending at current index
        int maxSoFar = nums[0]; // Initialize maximum sum so far
        int start = 0; // Starting index of the current maximum subarray
        int end = 0; // Ending index of the current maximum subarray
        int s = 0; // Starting index of the maximum subarray found so far

        // Iterate through the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // Update maximum sum ending at current index
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                start = i;
            } else {
                maxEndingHere += nums[i];
            }

            // Update maximum sum so far
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                end = i;
                s = start;
            }
        }

        // Print the maximum subarray and its sum
        System.out.println("Maximum subarray sum: " + maxSoFar);
        System.out.print("Maximum subarray: ");
        for (int i = s; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

