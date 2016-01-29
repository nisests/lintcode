package BinaryTreePostorderTraversal;

/* 二叉树的后序遍历 */

import java.util.ArrayList;

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
     * @return: Postorder in ArrayList which contains node values.
     */
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if(root == null){
            return list;
        }
        if(root.left != null){
            postorderTraversal(root.left);
        }
        if(root.right != null){
            postorderTraversal(root.right);
        }
        list.add(root.val);
        return list;
    }
}