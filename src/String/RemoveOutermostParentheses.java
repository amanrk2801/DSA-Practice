package String;

public class RemoveOutermostParentheses {
    // Method 1: Using StringBuilder to construct the result
    public static String removeOuterParenthesesMethod1(String S) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : S.toCharArray()) {
            if (c == '(' && openCount++ > 0) {
                result.append(c);
            } else if (c == ')' && openCount-- > 1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    // Method 2: Using a String to store the result
    public static String removeOuterParenthesesMethod2(String S) {
        String result = "";
        int openCount = 0;

        for (char c : S.toCharArray()) {
            if (c == '(' && openCount++ > 0) {
                result += c;
            } else if (c == ')' && openCount-- > 1) {
                result += c;
            }
        }

        return result;
    }

    // Method 3: Using a StringBuilder and no counter variable
    public static String removeOuterParenthesesMethod3(String S) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;
            } else if (c == ')') {
                openCount--;
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String S = "(()())(())";

        // Method 1
        System.out.println("Method 1: " + removeOuterParenthesesMethod1(S));

        // Method 2
        System.out.println("Method 2: " + removeOuterParenthesesMethod2(S));

        // Method 3
        System.out.println("Method 3: " + removeOuterParenthesesMethod3(S));
    }
}

