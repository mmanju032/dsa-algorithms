package manju.learning.arrays;

public class MaxProfilt {

	public static void main(String[] args) {
		int arr[] = { 7,6,4,3,1 };
		System.out.println("max profit in array: " + maxProfit(arr));
		System.out.println("max profit in array: " + maxProfit1(arr));

	}

//You are given an array prices where prices[i] is the price of a given stock on the ith day.

//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.	

//	Input: prices = [7,1,5,3,6,4]
//	Output: 5

//	Input: prices = [7,6,4,3,1]
//			Output: 0

	// brute-force
	public static int maxProfit(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[j] - array[i]) > max) {
					max = array[j] - array[i];
				}
			}
		}
		return max;
	}

	public static int maxProfit1(int[] prices) {
		int buy = Integer.MAX_VALUE;
		int profit = 0;
		int finalProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < buy) {
				buy = prices[i];
			}

			profit = prices[i] - buy;  // today's profit
			
			if(profit > finalProfit) {
				finalProfit = profit;
			}

		}
		return finalProfit;
	}
}
