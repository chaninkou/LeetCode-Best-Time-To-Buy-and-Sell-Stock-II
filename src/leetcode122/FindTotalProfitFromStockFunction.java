package leetcode122;

public class FindTotalProfitFromStockFunction {
	// o(n) time and O(1) space
    public int maxProfit(int[] prices) {
    	// 0 as default in case its like empty array or no solution
        int total = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            // If next element is greater than current element
        	// Since we only want to add the number that is greater than 0
            if(prices[i + 1] > prices[i]){  
                total += (prices[i + 1] - prices[i]);
            }
        }
            
        return total;
    }
}
