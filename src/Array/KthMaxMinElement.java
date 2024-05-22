package Array;

import java.util.Arrays;

public class KthMaxMinElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int k = 3;

        int kthMax = findKthMaximum(arr, k);
        int kthMin = findKthMinimum(arr, k);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(k + "th Maximum Element: " + kthMax);
        System.out.println(k + "th Minimum Element: " + kthMin);
    }

    public static int findKthMaximum(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static int findKthMinimum(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}

