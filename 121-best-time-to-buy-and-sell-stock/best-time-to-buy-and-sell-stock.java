class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        // Single for-each loop to iterate through the prices
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price seen so far
            } else {
                int profit = price - minPrice; // Calculate potential profit
                if (profit > maxProfit) {
                    maxProfit = profit; // Update max profit if higher
                }
            }
        }
        
        return maxProfit;
    }
}