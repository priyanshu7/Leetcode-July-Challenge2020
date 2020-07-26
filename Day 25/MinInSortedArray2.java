package july2020;

public class MinInSortedArray2 {
	
	public int findminn(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int min = lo + (hi - lo) / 2;
            if (nums[min] > nums[hi]) { 
                lo = min + 1;
            }
            else if (nums[min] < nums[lo]) { 
                hi = min;
                lo++;
            }
            else { 
                hi--;
            }
        }
        
        return nums[lo];
    }

}
