package String;

import java.util.StringJoiner;

public class ReverseWordsInString {
    // Method 1: Using StringBuilder
    public static String reverseWordsMethod1(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    // Method 2: Using StringBuilder and built-in reverse method
    public static String reverseWordsMethod2(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    // Method 3: Using StringJoiner
    public static String reverseWordsMethod3(String s) {
        String[] words = s.trim().split("\\s+");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sj.add(words[i]);
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";

        // Method 1
        System.out.println("Method 1: " + reverseWordsMethod1(s));

        // Method 2
        System.out.println("Method 2: " + reverseWordsMethod2(s));

        // Method 3
        System.out.println("Method 3: " + reverseWordsMethod3(s));
    }
}

