package Array;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        int n = 100; // Example: Calculate factorial of 100

        BigInteger factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + ": " + factorial);
    }

    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE; // Initialize result to 1

        // Calculate factorial using BigInteger
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}

