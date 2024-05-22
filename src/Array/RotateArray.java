package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int steps = 2;

        rotateRight(arr, steps);

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRight(int[] arr, int steps) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int n = arr.length;
        steps = steps % n; // Handle cases where steps > n

        // Create a temporary array to store elements to be rotated
        int[] temp = new int[steps];
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[n - steps + i];
        }

        // Shift the original array to the right
        for (int i = n - 1; i >= steps; i--) {
            arr[i] = arr[i - steps];
        }

        // Copy elements from the temporary array to the beginning of the original array
        for (int i = 0; i < steps; i++) {
            arr[i] = temp[i];
        }
    }
}

