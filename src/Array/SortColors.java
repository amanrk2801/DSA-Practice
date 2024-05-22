package Array;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] colors = {2, 0, 2, 1, 1, 0};
        sortColors(colors);
        System.out.println("Sorted Colors: " + Arrays.toString(colors));
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // If current element is 0, swap it with element at low index
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // If current element is 1, move to the next element
                    mid++;
                    break;
                case 2:
                    // If current element is 2, swap it with element at high index
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

