package BinaryTreeInorderTraversal;

import java.util.ArrayList;

/* 二叉树的中序遍历 */

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
     * @return: Inorder in ArrayList which contains node values.
     */
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if(root == null){
            return list;
        }
        if(root.left != null){
            inorderTraversal(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            inorderTraversal(root.right);
        }
        return list;
    }
}