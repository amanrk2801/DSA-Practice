package Array;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Print the average
        System.out.println("Average of all elements in the array: " + average);
    }
}
