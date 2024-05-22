package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(height);
        System.out.println("Trapped Water: " + trappedWater);
    }

    public static int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0; // No trapping possible with less than 3 bars
        }

        int n = height.length;
        int[] leftMax = new int[n]; // Array to store maximum height to the left of each bar
        int[] rightMax = new int[n]; // Array to store maximum height to the right of each bar

        // Calculate maximum height to the left of each bar
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate maximum height to the right of each bar
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate trapped water for each bar and sum up
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }
}

