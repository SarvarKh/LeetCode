class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; //left = buy;
        int r = 1; //right = sell;
        int maxP = 0;
        int profit = 0;
        
        while (r < prices.length) {
            if(prices[l] < prices[r]) {
                profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r += 1;
        }
        
        return maxP;
    }
}