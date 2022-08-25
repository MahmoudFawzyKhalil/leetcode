class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        
        int l = 0, r = 1;
        
        int maxProfit = 0;
        
        while(r < prices.length){
            if (prices[l] >= prices[r]) {
                l = r; 
                r++;
            } else {
                maxProfit = Math.max(prices[r] - prices[l], maxProfit);
                r++;
            }
        }
        
        return maxProfit;
    }
}