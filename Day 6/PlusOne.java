package july2020;
import java.util.*;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        ArrayList<Integer> nums = new ArrayList<>();
        int carry = 1;
        for(int i = n - 1; i >=0 ; i--){
            int sum = digits[i] + carry;
            carry = sum == 10 ? 1 : 0;
            nums.add(sum==10 ? 0 : sum);
        }
        if(carry == 1)
            nums.add(1);
        
        int[] ans = new int[nums.size()];
        int idx = 0;
        for(int i = nums.size() - 1; i >= 0; i--){
            ans[idx++] = nums.get(i);
        }
        return ans;
    }

}
