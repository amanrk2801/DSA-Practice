package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Find the second largest element in the array
        int secondLargest = findSecondLargest(array);

        // Print the second largest element
        System.out.println("Second largest element in the array: " + secondLargest);
    }

    // Function to find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than first largest, update first and second largest
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            // If current element is greater than second largest but smaller than first largest, update second largest
            else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        // If there is no second largest element, return Integer.MIN_VALUE
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        }

        return secondLargest;
    }
}

