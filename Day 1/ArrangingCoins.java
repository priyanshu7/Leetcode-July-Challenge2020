package july2020;

public class ArrangingCoins {
	
	public int arrangeCoinsNaive(int n) {
	    int temp = n;
	    for( int i = 1; i <= n; i++){
	        if(temp - i < 0)
	           return i - 1;
	        else if (temp - i == 0)
	           return i;
	        else
	           temp = temp - i;
	    }
	    return 0;
	}
	
	public int arrangeCoinsEfficient(int n) {
	    int lo = 0;
	    int hi = n;
	    long mid, curr;
	    while (lo <= hi) {
	        mid =(int)(lo + (hi - lo) / 2);
	        curr = mid * (mid + 1) / 2;
	        if (curr == n) 
	            return (int)mid;
	        if (n < curr) {
	            hi = (int)mid - 1;
	        } else {
	            lo = (int)mid + 1;
	        }
	    }
	    return hi;
	}

}
