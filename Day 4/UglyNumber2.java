package july2020;

public class UglyNumber2 {
	public int nthUglyNumber(int n) {
        if(n == 0)
            return 0;
        int[] dp = new int[n];
        dp[0] = 1;
        int i = 0, j = 0, k = 0, idx = 1;
        
        while(idx < n){
            int mul2 = dp[i] * 2;
            int mul3 = dp[j] * 3;
            int mul5 = dp[k] * 5;
            
            int min = Math.min(mul2, Math.min(mul3, mul5));
            dp[idx++] = min;
            
            if(min == mul2)
                i++;
            if(min == mul3)
                j++;
            if(min == mul5)
                k++;
        }
        return dp[n-1];
    }

}
