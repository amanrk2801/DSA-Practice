package Recursion;

public class StringReverse {
    // Iterative Approach
    public static String reverseIterative(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // Recursive Approach
    public static String reverseRecursive(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";

        // Iterative Approach
        System.out.println("Reverse of \"" + input + "\" (Iterative Approach) is: " + reverseIterative(input));

        // Recursive Approach
        System.out.println("Reverse of \"" + input + "\" (Recursive Approach) is: " + reverseRecursive(input));
    }
}

