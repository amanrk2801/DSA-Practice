package Recursion;

public class Fibonacci {
    // Iterative Approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    // Recursive Approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change the value of n to get the nth Fibonacci number

        // Iterative Approach
        System.out.println("The " + n + "th Fibonacci number (Iterative Approach) is: " + fibonacciIterative(n));

        // Recursive Approach
        System.out.println("The " + n + "th Fibonacci number (Recursive Approach) is: " + fibonacciRecursive(n));
    }
}

