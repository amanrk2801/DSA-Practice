package Array;

import java.util.Arrays;

public class RearrangeAlternating {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int pivot = 0; // Index to start partitioning positive and negative numbers

        for (int i = 0; i < n; i++) {
            // If the current element is negative
            if (arr[i] < 0) {
                // Swap the current element with the element at the pivot index
                swap(arr, i, pivot);
                // Move the pivot index to the next position
                pivot++;
            }
        }

        // After the above loop, all negative elements are moved to the beginning
        // Now, we alternate positive and negative elements starting from index 1
        int posIndex = pivot;
        int negIndex = 1;

        while (posIndex < n && negIndex < n && arr[negIndex] < 0) {
            // Swap positive and negative elements
            swap(arr, posIndex, negIndex);
            posIndex += 2;
            negIndex += 2;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

