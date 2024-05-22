package Array;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maximum profit
            }
        }

        return maxProfit;
    }
}

