package Recursion;

public class PrintNumbersInc {
    // Iterative Approach
    public static void printNumbersIterative() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    // Recursive Approach
    public static void printNumbersRecursive(int n) {
        if (n <= 5) {
            System.out.println(n);
            printNumbersRecursive(n + 1); // Recursive call with the next number
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing numbers using Iterative Approach:");
        printNumbersIterative();

        System.out.println("\nPrinting numbers using Recursive Approach:");
        printNumbersRecursive(1);
    }
}

