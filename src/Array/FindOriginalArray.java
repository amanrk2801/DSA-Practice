package Array;

import java.util.*;

public class FindOriginalArray {
    public static void main(String[] args) {
        int[] doubledArray = {1, 2, 2, 4};
        int[] originalArray = findOriginalArray(doubledArray);

        if (originalArray != null) {
            System.out.println("Original Array: " + Arrays.toString(originalArray));
        } else {
            System.out.println("No valid original array exists for the given doubled array.");
        }
    }

    public static int[] findOriginalArray(int[] doubledArray) {
        if (doubledArray.length % 2 != 0) {
            return null; // Invalid input: length is not even
        }

        Arrays.sort(doubledArray); // Sort the doubled array

        Map<Integer, Integer> countMap = new HashMap<>(); // Map to store element counts
        List<Integer> originalList = new ArrayList<>(); // List to store original array

        for (int num : doubledArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : doubledArray) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                if (count == 0) {
                    continue; // Skip if the count of this element is already used up
                }
                int originalNum = num / 2; // Determine the original element
                if (originalNum * 2 != num || countMap.getOrDefault(originalNum, 0) < count) {
                    return null; // Invalid input: no corresponding original element or not enough count
                }
                originalList.add(originalNum);
                countMap.put(originalNum, countMap.get(originalNum) - count);
                countMap.put(num, count - 1);
            }
        }

        int[] originalArray = new int[originalList.size()];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = originalList.get(i);
        }

        return originalArray;
    }
}

