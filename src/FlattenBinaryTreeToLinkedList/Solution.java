package FlattenBinaryTreeToLinkedList;

/* 将一棵二叉树按照前序遍历拆解成为一个假链表。
 * 所谓的假链表是说，用二叉树的 right 指针，来表示链表中的 next 指针。
 */

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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
	TreeNode root_tmp;
    public void flatten(TreeNode root) {
        // write your code here
        if(root == null){
    		return;
    	}
    	if(root_tmp != null){
    		root_tmp.right = root;
    		root_tmp.left = null;
    	}
    	root_tmp = root;
    	TreeNode right = root.right;
    	flatten(root.left);
    	flatten(right);
    }
}