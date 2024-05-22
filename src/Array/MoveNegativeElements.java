package Array;

import java.util.Arrays;

public class MoveNegativeElements {
    public static void main(String[] args) {
        int[] arr = {-4, 8, -3, 2, -7, 6, -1, 9};

        System.out.println("Original Array: " + Arrays.toString(arr));
        moveNegativeElements(arr);
        System.out.println("After moving negative elements: " + Arrays.toString(arr));
    }

    public static void moveNegativeElements(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Move left pointer to the right until it finds a negative element
            while (left <= right && arr[left] < 0) {
                left++;
            }
            // Move right pointer to the left until it finds a positive element
            while (left <= right && arr[right] >= 0) {
                right--;
            }
            // Swap elements if left pointer is less than or equal to right pointer
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
