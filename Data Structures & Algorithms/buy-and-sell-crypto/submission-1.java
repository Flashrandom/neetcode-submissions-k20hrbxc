class Solution {
    public int maxProfit(int[] prices) {
        if( prices.length == 0) return 0;
        int profit = 0;

        int left=0; int right = 0;

        while(right< prices.length){

            if( prices[left] >= prices[right] ){
                left = right;   
            }
            if( prices[right] > prices[left]){
                profit = Math.max( profit, prices[right] - prices[left]);
            }
            
            right++;
        }
        return profit;
    }
}
