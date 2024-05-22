package Recursion;

public class PrintNumbers {
    // Iterative Approach
    public static void printNumbersIterative() {
        System.out.println("Printing odd numbers using Iterative Approach:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nPrinting even numbers using Iterative Approach:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Recursive Approach
    public static void printNumbersRecursive(int n, boolean odd) {
        if (n <= 10) {
            if (odd && n % 2 != 0) {
                System.out.println(n);
            }
            if (!odd && n % 2 == 0) {
                System.out.println(n);
            }
            printNumbersRecursive(n + 1, odd);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing odd and even numbers using Recursive Approach:");
        System.out.println("Printing odd numbers:");
        printNumbersRecursive(1, true); // Start with odd numbers
        System.out.println("Printing even numbers:");
        printNumbersRecursive(1, false); // Start with even numbers

        System.out.println("\nPrinting odd and even numbers using Iterative Approach:");
        printNumbersIterative();
    }
}

