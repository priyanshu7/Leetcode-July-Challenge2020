package july2020;

import java.util.Stack;

public class BTFromInorderPostorder {
	
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
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int in = inorder.length, post = postorder.length;
		if(in == 0 || post == 0 || in != post)
			return null;
		in--;
		post--;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode root = new TreeNode(postorder[post]);
		TreeNode prev = null;
		stack.push(root);
		post--;
		
		while(post >= 0) {
			
			while(!stack.isEmpty() && stack.peek().val == inorder[in]) {
				prev = stack.pop();
				in--;
			}
			
			TreeNode child = new TreeNode(postorder[post]);
			if(prev != null) {
				prev.left = child;
			}else {
				TreeNode temp = stack.peek();
				temp.right = child;
			}
			
			stack.push(child);
			prev = null;
			post--;
		}
		
		return root;
	}
	
	// Recursive
	
	
	public TreeNode buildTreeRecur(int[] inorder, int[] postorder) {
        int in = inorder.length - 1, post = postorder.length - 1;
		return builder(inorder, 0 , in, postorder, post);
    }
    
    private TreeNode builder(int[] inorder, int start, int end, int[] postorder, int rootIdx){
        if(start > end)
            return null;
        TreeNode root = new TreeNode(postorder[rootIdx]);
        int i = 0;
        while(inorder[end - i] != root.val) i++;
        root.left = builder(inorder, start, end - i - 1, postorder, rootIdx - i - 1);
        root.right = builder(inorder, end - i + 1, end, postorder, rootIdx - 1);
        return root;
    }

}
