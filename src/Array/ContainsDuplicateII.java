package Array;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean containsDuplicate = containsNearbyDuplicate(nums, k);
        System.out.println("Contains Duplicate within distance " + k + ": " + containsDuplicate);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true; // Found duplicate within distance k
            }
            map.put(nums[i], i); // Update the index of the element in the map
        }

        return false; // No duplicate within distance k found
    }
}

