package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    // Method 1: Sorting and Comparison
    public static boolean areAnagrams1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    // Method 2: Using Character Counts
    public static boolean areAnagrams2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[256];
        for (char c : str1.toCharArray()) {
            count[c]++;
        }
        for (char c : str2.toCharArray()) {
            if (--count[c] < 0) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Using HashMap to Track Character Counts
    public static boolean areAnagrams3(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Check if the strings are anagrams using Method 1
        if (areAnagrams1(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams (Method 1).");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams (Method 1).");
        }

        // Check if the strings are anagrams using Method 2
        if (areAnagrams2(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams (Method 2).");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams (Method 2).");
        }

        // Check if the strings are anagrams using Method 3
        if (areAnagrams3(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams (Method 3).");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams (Method 3).");
        }
    }
}
