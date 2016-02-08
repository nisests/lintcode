package SwapNodesInPairs;

/* ��һ�����������������еĽڵ㣬Ȼ�󷵻ؽ���������� */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
    	ListNode dummy = head;
    	while(head != null && head.next != null){
    		int tmp = head.val;
    		head.val = head.next.val;
    		head.next.val = tmp;
    		head = head.next.next;
    	}
    	return dummy;
    }
}