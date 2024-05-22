package Array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String largestNumber = largestNumber(nums);
        System.out.println("Largest Number: " + largestNumber);
    }

    public static String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                // Compare concatenated strings in descending order
                return order2.compareTo(order1);
            }
        });

        // Special case: if the largest number is "0", return "0" directly
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }

        return sb.toString();
    }
}

