package leetcode122;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		
		System.out.println("Input: " + Arrays.toString(prices));
		
		FindTotalProfitFromStockFunction solution = new FindTotalProfitFromStockFunction();
		
		System.out.println("Solution: " + solution.maxProfit(prices));
	}
}
