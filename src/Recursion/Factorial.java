package Recursion;

public class Factorial {
    // Iterative Approach
    public static int factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive Approach
    public static int factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Change the value of number to calculate factorial for a different number

        // Iterative Approach
        System.out.println("Factorial of " + number + " (Iterative Approach) is: " + factorialIterative(number));

        // Recursive Approach
        System.out.println("Factorial of " + number + " (Recursive Approach) is: " + factorialRecursive(number));
    }
}

