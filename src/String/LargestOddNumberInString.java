package String;

public class LargestOddNumberInString {
    // Method 1: Using a traditional loop
    public static String largestOddNumberMethod1(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    // Method 2: Using Java Streams
    public static String largestOddNumberMethod2(String num) {
        return num.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c % 2 != 0)
                .map(Object::toString)
                .reduce("", (acc, s) -> s + acc);
    }

    // Method 3: Using a StringBuilder
    public static String largestOddNumberMethod3(String num) {
        StringBuilder result = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if (digit % 2 != 0) {
                result.insert(0, digit);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String num = "52";

        // Method 1
        System.out.println("Method 1: " + largestOddNumberMethod1(num));

        // Method 2
        System.out.println("Method 2: " + largestOddNumberMethod2(num));

        // Method 3
        System.out.println("Method 3: " + largestOddNumberMethod3(num));
    }
}

