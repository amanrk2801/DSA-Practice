package Array;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Display the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}

