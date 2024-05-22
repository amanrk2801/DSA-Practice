package Recursion;

public class PrintNumbersDec {
    // Iterative Approach
    public static void printNumbersIterative() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Recursive Approach
    public static void printNumbersRecursive(int n) {
        if (n >= 1) {
            System.out.println(n);
            printNumbersRecursive(n - 1); // Recursive call with the previous number
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing numbers from 5 to 1 using Iterative Approach:");
        printNumbersIterative();

        System.out.println("\nPrinting numbers from 5 to 1 using Recursive Approach:");
        printNumbersRecursive(5);
    }
}

