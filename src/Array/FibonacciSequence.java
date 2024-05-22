package Array;

public class FibonacciSequence {
    public static void main(String[] args) {
        int numberOfTerms = 10; // Change the number of terms as needed

        System.out.println("Fibonacci sequence up to " + numberOfTerms + " terms:");
        printFibonacciSequence(numberOfTerms);
    }

    public static void printFibonacciSequence(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;

        if (numberOfTerms >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (numberOfTerms >= 2) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= numberOfTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

