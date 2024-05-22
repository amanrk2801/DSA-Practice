package Array;

import java.util.*;

public class GroupAnagramsWithoutSorting {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);

        // Print the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26]; // Assuming only lowercase letters are present

            // Count the frequency of each character in the word
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // Generate a unique hash for the word based on its character frequencies
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
                sb.append("#"); // Delimiter to distinguish frequencies
            }
            String hash = sb.toString();

            // Group anagrams based on the generated hash
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

