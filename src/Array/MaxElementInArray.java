package Array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Find the maximum element in the array
        int maxElement = findMaxElement(array);

        // Print the maximum element
        System.out.println("Maximum element in the array: " + maxElement);
    }

    // Function to find the maximum element in an array
    public static int findMaxElement(int[] arr) {
        // Assuming the first element is the maximum
        int max = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            // If current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

