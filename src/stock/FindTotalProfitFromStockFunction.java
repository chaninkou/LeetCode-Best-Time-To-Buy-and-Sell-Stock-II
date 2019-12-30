package stock;

public class FindTotalProfitFromStockFunction {
    public int maxProfit(int[] prices) {
        int total = 0;
        
        // also o(n)
        for(int i = 0; i < prices.length - 1; i++){
            // If next element is greater than current element
            if(prices[i + 1] > prices[i]){
                // Add the profit to the total
                total += prices[i + 1] - prices[i];
            }
        }
            
        return total;
    }
}
