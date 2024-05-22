package Array;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 2, 2};

        Map<Integer, Integer> frequency = findFrequency(arr);

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

    public static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int element : arr) {
            if (frequency.containsKey(element)) {
                frequency.put(element, frequency.get(element) + 1);
            } else {
                frequency.put(element, 1);
            }
        }

        return frequency;
    }
}

