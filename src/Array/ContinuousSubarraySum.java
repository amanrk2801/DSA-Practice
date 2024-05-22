package Array;

import java.util.*;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean result = checkSubarraySum(nums, k);
        System.out.println("Does there exist a continuous subarray with sum " + k + "? " + result);
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Initialize with a remainder of 0 at index -1

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum = sum % k; // Calculate the remainder if k is not zero
            }
            if (remainderMap.containsKey(sum)) {
                // Check if the current remainder has been seen before
                if (i - remainderMap.get(sum) > 1) {
                    return true; // Subarray found with length at least two
                }
            } else {
                // Store the remainder along with its index
                remainderMap.put(sum, i);
            }
        }

        return false;
    }
}
