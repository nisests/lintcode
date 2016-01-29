package BinaryTreePreorderTraversal;

/* 二叉树的前序遍历 */

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
import java.util.ArrayList;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        if(root == null){
            return list;
        }
        list.add(root.val);
        if(root.left != null){
            preorderTraversal(root.left);
        }
        if(root.right != null){
            preorderTraversal(root.right);
        }
        return list;
    }
}