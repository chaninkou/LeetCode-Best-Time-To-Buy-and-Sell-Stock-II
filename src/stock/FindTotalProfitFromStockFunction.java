package stock;

public class FindTotalProfitFromStockFunction {
    public int maxProfit(int[] prices) {
        int total = 0;
        
        // also o(n), going through the whole array, prices.length - 1 because i + 1
        for(int i = 0; i < prices.length - 1; i++){
            // If next element is greater than current element
        	// Since we only want to add the number that is greater than 0
            if(prices[i + 1] > prices[i]){  
                // Only add the profit to the total
                total += prices[i + 1] - prices[i];
            }
        }
            
        return total;
    }
}
