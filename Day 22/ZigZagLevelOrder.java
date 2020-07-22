package july2020;

import july2020.LevelOrder2.TreeNode;
import java.util.*;

public class ZigZagLevelOrder {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        boolean leftStart = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            while(size-->0){
                TreeNode temp = q.poll();
                level.add(temp.val);
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
            }
            if(!leftStart){
                Collections.reverse(level);
            }
            res.add(level);
            leftStart = !leftStart;
        }
        
        return res;
    }

}
