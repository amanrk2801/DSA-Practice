package String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    // Method 1: Using two HashMaps to track character mappings
    public static boolean areIsomorphicMethod1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if ((sToT.containsKey(charS) && sToT.get(charS) != charT) ||
                    (tToS.containsKey(charT) && tToS.get(charT) != charS)) {
                return false;
            }

            sToT.put(charS, charT);
            tToS.put(charT, charS);
        }

        return true;
    }

    // Method 2: Using a single HashMap to track character mappings
    public static boolean areIsomorphicMethod2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (charMap.containsKey(charS)) {
                if (charMap.get(charS) != charT) {
                    return false;
                }
            } else {
                if (charMap.containsValue(charT)) {
                    return false; // Mapping is not one-to-one
                }
                charMap.put(charS, charT);
            }
        }

        return true;
    }

    // Method 3: Using two arrays to track character mappings
    public static boolean areIsomorphicMethod3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256]; // Assuming ASCII characters
        int[] mapT = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Assign unique mappings
            if (mapS[charS] == 0) {
                mapS[charS] = i + 1;
                mapT[charT] = i + 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "one";
        String t1 = "two";

        // Method 1: Using two HashMaps
        System.out.println("Method 1:");
        if (areIsomorphicMethod1(s1, t1)) {
            System.out.println(s1 + " and " + t1 + " are isomorphic.");
        } else {
            System.out.println(s1 + " and " + t1 + " are not isomorphic.");
        }

        // Method 2: Using a single HashMap
        System.out.println("\nMethod 2:");
        if (areIsomorphicMethod2(s1, t1)) {
            System.out.println(s1 + " and " + t1 + " are isomorphic.");
        } else {
            System.out.println(s1 + " and " + t1 + " are not isomorphic.");
        }

        // Method 3: Using two arrays
        System.out.println("\nMethod 3:");
        if (areIsomorphicMethod3(s1, t1)) {
            System.out.println(s1 + " and " + t1 + " are isomorphic.");
        } else {
            System.out.println(s1 + " and " + t1 + " are not isomorphic.");
        }
    }
}

