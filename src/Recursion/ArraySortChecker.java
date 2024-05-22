package Recursion;

public class ArraySortChecker {
    // Iterative Approach
    public static boolean isSortedIterative(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Recursive Approach
    public static boolean isSortedRecursive(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Iterative Approach
        if (isSortedIterative(arr)) {
            System.out.println("Array is sorted in non-decreasing order (Iterative Approach)");
        } else {
            System.out.println("Array is not sorted in non-decreasing order (Iterative Approach)");
        }

        // Recursive Approach
        if (isSortedRecursive(arr, 0)) {
            System.out.println("Array is sorted in non-decreasing order (Recursive Approach)");
        } else {
            System.out.println("Array is not sorted in non-decreasing order (Recursive Approach)");
        }
    }
}

