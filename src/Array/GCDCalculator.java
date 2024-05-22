package Array;

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Find the GCD using the Euclidean algorithm
        int gcd = findGCD(number1, number2);

        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }
        // Recursive case
        return findGCD(b, a % b);
    }
}

