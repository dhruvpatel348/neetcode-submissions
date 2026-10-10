class Solution {
    public int maxProfit(int[] prices) {
       int l = 0;
       int r = 1;
       int init = prices[0];
       int maxprofit = 0;
       boolean buy = false;
       while(r < prices.length) {
        if(prices[l] >= prices[r]) {
            l = r;
            r++;

        }
        else {
            maxprofit = Math.max(maxprofit, prices[r] - prices[l]);
            r++;

        }
       }
       return maxprofit; 
    }
}
