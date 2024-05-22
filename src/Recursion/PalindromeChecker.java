package Recursion;

public class PalindromeChecker {
    // Iterative Approach
    public static boolean isPalindromeIterative(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // Recursive Approach
    public static boolean isPalindromeRecursive(String s) {
        return isPalindromeRecursiveHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeRecursiveHelper(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeRecursiveHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "radar";

        // Iterative Approach
        if (isPalindromeIterative(input)) {
            System.out.println(input + " is a palindrome (Iterative Approach)");
        } else {
            System.out.println(input + " is not a palindrome (Iterative Approach)");
        }

        // Recursive Approach
        if (isPalindromeRecursive(input)) {
            System.out.println(input + " is a palindrome (Recursive Approach)");
        } else {
            System.out.println(input + " is not a palindrome (Recursive Approach)");
        }
    }
}

