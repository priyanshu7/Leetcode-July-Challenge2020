public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        
        for(int num : nums){
            List<List<Integer>> newSubsets = new ArrayList<>();
            
            for(List<Integer> subset : ans){
                List<Integer> temp = new ArrayList<>(subset);
                temp.add(num);
                newSubsets.add(temp);
            }
            
            for(List<Integer> subset : newSubsets){
                ans.add(subset);
            }
        }
        return ans;
    }