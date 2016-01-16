package kuaileshu;

import java.util.HashSet;

/*写一个算法来判断一个数是不是"快乐数"。
 * 一个数是不是快乐是这么定义的：
 * 对于一个正整数，每一次将该数替换为他每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为1，或是无限循环但始终变不到1。
 * 如果可以变为1，那么这个数就是快乐数。*/

public class Solution {
	/**
	 * @param n
	 *            an integer
	 * @return true if this is a happy number or false
	 */
	public boolean isHappy(int n) {
		// Write your code here
		HashSet hashSet = new HashSet();
		boolean flag;
		while (true) {
			n = calc(n);
			if (hashSet.contains(n)) {
				flag = false;
				break;
			} else if (n == 1) {
				flag = true;
				break;
			} else {
				hashSet.add(n);
			}
		}
		return flag;
	}

	public int calc(int n) {
		int len = new Integer(n).toString().length();
		int count = 0;
		// 从高位往低位取
		for (int i = 0; i < len; i++) {
			int temp = (int) Math.pow(10, len - i - 1);
			count += Math.pow(n / temp, 2);
			n = n % temp;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		if (solution.isHappy(7)) {
			System.out.println("是快乐数");
		} else {
			System.out.println("不是快乐数");
		}
	}

}
