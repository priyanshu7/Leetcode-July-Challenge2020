package july2020;

import java.util.*;

public class LevelOrder2 {
	
	// BFS APPROACH
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            while(size-- > 0){
                TreeNode remove = q.poll();
                level.add(remove.val);
                if(remove.left != null)
                    q.offer(remove.left);
                if(remove.right != null)
                    q.offer(remove.right);
            }
            ans.addFirst(level);
        }
        return ans;
    }
	
	
	//DFS APPROACH
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	  }
	 
	class Solution {
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> ans = new ArrayList<>();
	        if(root == null) {
	            return ans;
	        }

	        dfs(root, 0, ans);
	        return ans;
	    }

	    public void dfs(TreeNode root, int depth, List<List<Integer>> ans) {
	        if(root == null) {
	            return;
	        }

	        if(depth == ans.size()) {
	            ans.add(0, new ArrayList<Integer>());
	        }

	        ans.get(ans.size() - depth - 1).add(root.val);
	        dfs(root.left, depth + 1, ans);
	        dfs(root.right, depth + 1, ans);
	    }
	}

}
