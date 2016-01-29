package MaximumDepthOfBinaryTree;

/* 二叉树的最大深度 */

import BinaryTreePaths.TreeNode;

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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        int depth = ergodic(root,0);
        return depth;
    }
    int max=0;
    public int ergodic(TreeNode root,int depth){
        if(root == null){
            return 0;
        }
        if(root.left != null){
            ergodic(root.left,depth+1);
        }
        if(root.right != null){
            ergodic(root.right,depth+1);
        }
        max = max>depth?max:depth;
        return max+1;
    }
}