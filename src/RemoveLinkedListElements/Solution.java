package RemoveLinkedListElements;

/* 删除链表中等于给定值val的所有节点。 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	/**
	 * @param head
	 *            a ListNode
	 * @param val
	 *            an integer
	 * @return a ListNode
	 */
	public ListNode removeElements(ListNode head, int val) {
		// Write your code here
		ListNode ln = new ListNode(0);
		ln.next = head;
		head = ln;
		while (head.next != null) {
			if (head.next.val == val) {
				head.next = head.next.next;
				continue;
			}
			head = head.next;
		}
		return ln.next;
	}
}