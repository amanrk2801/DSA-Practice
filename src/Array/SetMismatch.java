package Array;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Missing Number: " + result[0] + ", Duplicate Number: " + result[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            } else if (nums[i] + 1 != nums[i + 1]) {
                missing = nums[i] + 1;
            }
        }

        // Check for missing number at the end
        if (nums[n - 1] != n) {
            missing = n;
        }

        return new int[]{missing, duplicate};
    }
}

