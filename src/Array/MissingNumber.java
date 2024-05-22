package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Example array with one missing number
        int n = array.length + 1; // Number of elements if no number was missing
        int totalSum = n * (n + 1) / 2; // Sum of natural numbers from 1 to n

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }

        // The missing number is the difference between the total sum and the sum of elements in the array
        int missingNumber = totalSum - arraySum;

        // Print the missing number
        System.out.println("The missing number in the array is: " + missingNumber);
    }
}

