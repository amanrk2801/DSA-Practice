package Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibriumIndex = findEquilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point found at index " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found in the array.");
        }
    }

    public static int findEquilibrium(int[] arr) {
        int n = arr.length;
        if (n == 1) // Edge case when there is only one element
        {
            return 1;
        }
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Traverse the array and check for equilibrium point
        for (int i = 0; i < n; i++) {
            // Subtract the current element from total sum to get the right sum
            totalSum -= arr[i];

            // If left sum is equal to right sum, we found the equilibrium point
            if (leftSum == totalSum) {
                return i;
            }

            // Add the current element to the left sum for the next iteration
            leftSum += arr[i];
        }

        // If no equilibrium point found, return -1
        return -1;
    }
}

