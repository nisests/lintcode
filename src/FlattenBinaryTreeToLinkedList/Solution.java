package FlattenBinaryTreeToLinkedList;

/* ��һ�ö���������ǰ���������Ϊһ��������
 * ��ν�ļ�������˵���ö������� right ָ�룬����ʾ�����е� next ָ�롣
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