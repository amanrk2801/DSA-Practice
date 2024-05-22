package String;

public class StringRotation {
    // Method 1: Using String Concatenation
    public static String rotateStringConcatenation(String str, int positions) {
        int effectivePositions = positions % str.length();
        return str.substring(effectivePositions) + str.substring(0, effectivePositions);
    }

    // Method 2: Using StringBuilder
    public static String rotateStringStringBuilder(String str, int positions) {
        int effectivePositions = positions % str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(effectivePositions));
        sb.append(str.substring(0, effectivePositions));
        return sb.toString();
    }

    // Method 3: Using Character Array
    public static String rotateStringCharArray(String str, int positions) {
        int effectivePositions = positions % str.length();
        char[] charArray = str.toCharArray();
        reverse(charArray, 0, effectivePositions - 1);
        reverse(charArray, effectivePositions, str.length() - 1);
        reverse(charArray, 0, str.length() - 1);
        return new String(charArray);
    }

    // Helper method to reverse a portion of the character array
    private static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        int positions = 3;

        // Method 1: Using String Concatenation
        String rotatedString1 = rotateStringConcatenation(str, positions);
        System.out.println("Rotated string (Method 1): " + rotatedString1);

        // Method 2: Using StringBuilder
        String rotatedString2 = rotateStringStringBuilder(str, positions);
        System.out.println("Rotated string (Method 2): " + rotatedString2);

        // Method 3: Using Character Array
        String rotatedString3 = rotateStringCharArray(str, positions);
        System.out.println("Rotated string (Method 3): " + rotatedString3);
    }
}

