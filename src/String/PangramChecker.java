package String;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    // Method 1: Using a boolean array to track seen letters
    public static boolean isPangramMethod1(String sentence) {
        boolean[] seen = new boolean[26]; // Assuming only lowercase English letters
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                return false;
            }
        }
        return true;
    }

    // Method 2: Using a HashSet to track seen letters
    public static boolean isPangramMethod2(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen.add(c);
            }
        }
        return seen.size() == 26;
    }

    // Method 3: Using a BitSet to track seen letters
    public static boolean isPangramMethod3(String sentence) {
        BitSet seen = new BitSet(26);
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen.set(c - 'a');
            }
        }
        return seen.cardinality() == 26;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Method 1: Using a boolean array
        System.out.println("Method 1:");
        if (isPangramMethod1(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        // Method 2: Using a HashSet
        System.out.println("\nMethod 2:");
        if (isPangramMethod2(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        // Method 3: Using a BitSet
        System.out.println("\nMethod 3:");
        if (isPangramMethod3(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}

