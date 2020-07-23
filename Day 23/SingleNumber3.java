package july2020;

public class SingleNumber3 {
	
	public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        xor &= -xor;
        int[] ans = {0, 0};
        for (int num : nums)
        {
            if ((num & xor) == 0) 
            {
                ans[0] ^= num;
            }
            else 
            {
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
