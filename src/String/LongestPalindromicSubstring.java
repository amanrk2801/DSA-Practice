package String;

public class LongestPalindromicSubstring {
    // Method 1: Brute Force (Correct)
    public static String longestPalindromeMethod1(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }
        return longestPalindrome;
    }

    // Method 2: Expand Around Center (Correct)
    public static String longestPalindromeMethod2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Method 3: Dynamic Programming (Correct)
    public static String longestPalindromeMethod3(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int length = 2; length <= s.length(); length++) {
            for (int i = 0; i < s.length() - length + 1; i++) {
                int j = i + length - 1;
                if (length == 2 && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                } else if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }
        return s.substring(start, start + maxLength);
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";

        // Method 1
        System.out.println("Method 1: " + longestPalindromeMethod1(s));

        // Method 2
        System.out.println("Method 2: " + longestPalindromeMethod2(s));

        // Method 3
        System.out.println("Method 3: " + longestPalindromeMethod3(s));
    }
}

