package String;

public class ReverseString {
    // Method 1: Using StringBuilder.reverse()
    public static String reverseWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Method 2: Using StringBuilder and a Loop
    public static String reverseWithLoop(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method 3: Using Char Array and Two Pointers
    public static String reverseWithTwoPointers(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);

        // Method 1: Using StringBuilder.reverse()
        String reversed1 = reverseWithStringBuilder(str);
        System.out.println("Reversed string (Method 1): " + reversed1);

        // Method 2: Using StringBuilder and a Loop
        String reversed2 = reverseWithLoop(str);
        System.out.println("Reversed string (Method 2): " + reversed2);

        // Method 3: Using Char Array and Two Pointers
        String reversed3 = reverseWithTwoPointers(str);
        System.out.println("Reversed string (Method 3): " + reversed3);
    }
}

