package IdenticalBinaryTree;

import java.util.ArrayList;
import java.util.List;

import BinaryTreePaths.TreeNode;

/* ������ö������Ƿ�ȼۡ�
 * �ȼ۵���˼��˵��
 * �������ö���������ӵ����ͬ�Ľṹ������ÿ����Ӧλ���ϵĽڵ��ϵ�������ȡ�**/

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
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
	public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
    	List list_a = new ArrayList<String>();
    	List list_b = new ArrayList<String>();
    	if(a != null){
    		list_a = ergodic(a,list_a);
    	}
    	if(b != null){
    	    list_b = ergodic(b,list_b);
    	}
    	if(list_a.toString().equals(list_b.toString())){
    		return true;    		
    	}else{
    		return false;
    	}
    }
    
    public List<String> ergodic(TreeNode tree,List list){
    	list.add(tree.val);
    	if(tree.left != null){
    		ergodic(tree.left,list);
    	}else{
    		list.add("#");
    	}
    	if(tree.right != null){
    		ergodic(tree.right,list);
    	}else{
    		list.add("#");
    	}
    	return list;
    }
}