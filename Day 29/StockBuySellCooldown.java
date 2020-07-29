public static int maxProfit(int[] prices) {
		int n = prices.length;
		if(n == 0) return 0;
		int[] buy = new int[n];
		int[] sell = new int[n];
		sell[0] = 0;
		buy[0] = -prices[0];
		for(int i = 1; i < n; i++) {
			sell[i] = Math.max(sell[i-1], buy[i-1] + prices[i]);
			buy[i] = (i >= 2) ? Math.max(buy[i-1], sell[i-2] - prices[i]) : Math.max(buy[i-1], sell[i-1] - prices[i]);
		}
		return sell[n-1];
	}