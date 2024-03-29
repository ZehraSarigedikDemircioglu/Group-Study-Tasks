package week09;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] price = {7, 1, 5, 3, 6, 4};
        int[] price2 = {7, 6, 4, 3, 1};

        System.out.println(maxProfit(price)); // 5
        System.out.println(maxProfit(price2)); // 0
        System.out.println(maxProfit2(price)); // 5
        System.out.println(maxProfit2(price2)); // 0
        System.out.println(maxProfit3(price)); // 5
        System.out.println(maxProfit3(price2)); // 0

    }

    public static int maxProfit(int[] prices) {

        int n = prices.length;

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int i = 0;
        while (i < n) {
            minPrice = Math.min(minPrice, prices[i]);

            if (prices[i] >= minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
                i++;
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }

    public static int maxProfit3(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int diff = prices[j] - prices[i];
                    if (diff > max)
                        max = diff;
                }
            }
        }
        return max;
    }
}
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
 */
