package Array;

import java.util.Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3; // Group size

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseInGroups(arr, k);
        System.out.println("Array reversed in groups of " + k + ": " + Arrays.toString(arr));
    }

    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Ensure not to go beyond array length

            // Reverse the current group
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

