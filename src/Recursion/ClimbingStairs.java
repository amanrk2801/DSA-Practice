package Recursion;

public class ClimbingStairs {
    // Iterative Approach
    public static int climbStairsIterative(int n) {
        if (n <= 2) {
            return n;
        }
        int prev1 = 1;
        int prev2 = 2;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    // Recursive Approach
    public static int climbStairsRecursive(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    // Dynamic Programming Approach
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int steps = 2; // Change the value of steps to calculate the number of ways to climb stairs for a different number of steps

        // Iterative Approach
        System.out.println("Number of ways to climb " + steps + " steps (Iterative Approach) is: " + climbStairsIterative(steps));

        // Recursive Approach
        System.out.println("Number of ways to climb " + steps + " steps (Recursive Approach) is: " + climbStairsRecursive(steps));

        // Dynamic Programming Approach
        System.out.println("Number of ways to climb " + steps + " steps is (Dynamic Programming Approach): " + climbStairs(steps));
    }
}
