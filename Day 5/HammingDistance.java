package july2020;

public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
        int p = x ^ y;
        int setBits = 0;
        while(p > 0){
            setBits += p & 1;
            p >>= 1;
        }
        return setBits;
    }

}
