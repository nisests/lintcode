package kuaileshu;

import java.util.HashSet;

/*дһ���㷨���ж�һ�����ǲ���"������"��
 * һ�����ǲ��ǿ�������ô����ģ�
 * ����һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�
 * Ȼ���ظ��������ֱ���������Ϊ1����������ѭ����ʼ�ձ䲻��1��
 * ������Ա�Ϊ1����ô��������ǿ�������*/

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
		// �Ӹ�λ����λȡ
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
			System.out.println("�ǿ�����");
		} else {
			System.out.println("���ǿ�����");
		}
	}

}
