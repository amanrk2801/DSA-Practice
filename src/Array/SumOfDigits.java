package Array;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        // Iterate through each digit of the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}

