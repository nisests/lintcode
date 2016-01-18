package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

//给一棵二叉树，找出从根节点到叶子节点的所有路径。

/**
 * Definition of TreeNode: 
 * public class TreeNode { 
 *     public int val; 
 *     public TreeNode left, right; 
 *     public TreeNode(int val) { 
 *         this.val = val; 
 *         this.left = this.right = null; 
 *     } 
 * }
 */
public class Solution {
	/**
	 * @param root
	 *            the root of the binary tree
	 * @return all root-to-leaf paths
	 */
	List list = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		// Write your code here
		if(root == null){
			return list;
		}
		String path = new String(new Integer(root.val).toString());
		ergodic(root, path);
		return list;
	}
	
	public void ergodic(TreeNode root,String path){
		if(root.left != null){
			String str = new String();
			str = path + "->" + root.left.val;
			ergodic(root.left,str);
		}
		if(root.right != null){
			String str = new String();
			str = path +  "->" + root.right.val;
			ergodic(root.right,str);
		}
		if(root.left == null && root.right == null){
			list.add(path);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode left1 = new TreeNode(2);
		TreeNode right1 = new TreeNode(3);
		TreeNode left2 = new TreeNode(5);

		root.left = left1;
		root.right = right1;
		left1.left = left2;
		
		Solution solution = new Solution();
		List list = new ArrayList<String>();
		list = solution.binaryTreePaths(root);
		System.out.println(list);
	}

}
