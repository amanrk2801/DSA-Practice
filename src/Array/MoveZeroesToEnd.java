package Array;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 7, 0, 5, 6};

        moveZeroesToEnd(arr);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, move it to the nonZeroIndex position
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining positions with zeroes
        while (nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }
    }
}

