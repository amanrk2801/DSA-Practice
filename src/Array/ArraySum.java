package Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Print the sum
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
