package String;

import java.util.*;

public class StringCompression {
    // Method 1: Using StringBuilder
    public static String compressStringMethod1(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    // Method 2: Using HashMap
    public static String compressStringMethod2(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        StringBuilder compressed = new StringBuilder();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            compressed.append(entry.getKey());
            compressed.append(entry.getValue());
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    // Method 3: Using ArrayList
    public static String compressStringMethod3(String str) {
        List<Character> characters = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        StringBuilder compressed = new StringBuilder();

        char prev = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == prev) {
                count++;
            } else {
                characters.add(prev);
                counts.add(count);
                prev = current;
                count = 1;
            }
        }

        characters.add(prev);
        counts.add(count);

        for (int i = 0; i < characters.size(); i++) {
            compressed.append(characters.get(i));
            compressed.append(counts.get(i));
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String str = "aabcccccaaa";

        // Method 1
        System.out.println("Method 1: " + compressStringMethod1(str));

        // Method 2
        System.out.println("Method 2: " + compressStringMethod2(str));

        // Method 3
        System.out.println("Method 3: " + compressStringMethod3(str));
    }
}

