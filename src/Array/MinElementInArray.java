package Array;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 5};

        // Find the minimum element in the array
        int minElement = findMinElement(array);

        // Print the minimum element
        System.out.println("Minimum element in the array: " + minElement);
    }

    // Function to find the minimum element in an array
    public static int findMinElement(int[] arr) {
        // Assuming the first element is the minimum
        int min = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            // If current element is smaller than min, update min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

