package july2020;

import java.util.*;

public class TopKFrequentElements {
	
	public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for( int i : nums)
            map.put(i, map.getOrDefault(i,0) + 1);
        
        @SuppressWarnings("unchecked")
		List<Integer> [] bucket = new ArrayList[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        List<Integer> res= new ArrayList<>();
        for ( int i=nums.length;i>=0;i--){
            if (bucket[i]!=null){
                res.addAll(bucket[i]);
            }
            if (res.size()>=k) break;
        }
        
        int [] ans=new int[k];
        for (int i=0; i<k; i++)
            ans[i]=res.get(i);
        
        return ans;
    }

}
