package Array;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 5}; // Example array with duplicates

        findDuplicatesHashSet(array);
        findDuplicatesNestedLoops(array);
        findDuplicatesTwoPointers(array);
    }

    // Function to find duplicates in an array using HashSet
    public static void findDuplicatesHashSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicates in the array using HashSet:");

        for (int num : array) {
            if (!set.add(num)) {
                System.out.println(num);
            }
        }
    }

    // Function to find duplicates in an array using nested loops
    public static void findDuplicatesNestedLoops(int[] array) {
        System.out.println("Duplicates in the array using nested loops:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }

    // Function to find duplicates in an array using two pointers (works only for sorted arrays)
    public static void findDuplicatesTwoPointers(int[] array) {
        System.out.println("Duplicates in the array using two pointers:");

        // Sort the array (optional, depending on whether the array is already sorted or not)
         Arrays.sort(array);

        int left = 0;
        int right = 1;

        while (right < array.length) {
            if (array[left] == array[right]) {
                System.out.println(array[left]);
                left++;
                right++;
            } else {
                left = right;
                right++;
            }
        }
    }
}
