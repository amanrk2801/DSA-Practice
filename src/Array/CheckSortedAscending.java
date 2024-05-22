package Array;

public class CheckSortedAscending {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};  // Sorted in ascending order
        int[] array2 = {5, 4, 3, 2, 1};  // Not sorted in ascending order

        // Check if array1 is sorted in ascending order
        boolean isSorted1 = isSortedAscending(array1);
        System.out.println("Array1 is sorted in ascending order: " + isSorted1);

        // Check if array2 is sorted in ascending order
        boolean isSorted2 = isSortedAscending(array2);
        System.out.println("Array2 is sorted in ascending order: " + isSorted2);
    }

    // Function to check if an array is sorted in ascending order
    public static boolean isSortedAscending(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // If any element is greater than the next element, array is not sorted in ascending order
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        // If all elements are in ascending order or array has only one element
        return true;
    }
}

