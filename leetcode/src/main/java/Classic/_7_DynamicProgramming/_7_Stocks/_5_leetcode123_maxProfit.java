package Classic._7_DynamicProgramming._7_Stocks;

/**
 * <p>Description:  xx</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2019/9/26 19:21
 */


public class _5_leetcode123_maxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int[][][] dp = new int[prices.length][2+1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int k = 0; k < 2; k++) {
                if (i == 0) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k+1][0] - prices[i]);
            }
        }
        return dp[prices.length-1][0][0];
    }

    public static void main(String[] args) {
        _5_leetcode123_maxProfit solution = new _5_leetcode123_maxProfit();
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(solution.maxProfit(prices));
    }
}
