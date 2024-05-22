package Recursion;

public class Power {
    // Iterative Approach
    public static double powerIterative(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent >= 0 ? result : 1 / result;
    }

    // Recursive Approach
    public static double powerRecursive(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / (base * powerRecursive(base, -exponent - 1));
        }
        return base * powerRecursive(base, exponent - 1);
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 5; // Change the value of exponent to calculate power for a different exponent

        // Iterative Approach
        System.out.println(base + " raised to the power of " + exponent + " (Iterative Approach) is: " + powerIterative(base, exponent));

        // Recursive Approach
        System.out.println(base + " raised to the power of " + exponent + " (Recursive Approach) is: " + powerRecursive(base, exponent));
    }
}

