package NumberOfAirplanesInTheSky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* �����ɻ�����ɺͽ���ʱ����б�
 * �� interval ���б�ʾ. ����������ͬʱ����ж��ټܷɻ���
 * ���磺����ÿ�ܷɻ�����ʱ���б�[[1,10],[2,3],[5,8],[4,7]], ����3��
 */

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Point implements Comparable<Point>{
	int time,flag;
	Point(int time,int flag){
		this.time = time;
		this.flag = flag;
	}
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(this.time == o.time){
			return this.flag-o.flag;
		}else{
			return this.time-o.time;
		}
	}
}

class Solution {
    /**
     * @param intervals: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) { 
        // write your code here
    	if(airplanes == null){
    		return 0;
    	}
    	ArrayList<Point> list = new ArrayList<Point>(airplanes.size()*2);
    	for(Interval i:airplanes){
    		list.add(new Point(i.start,1));
    		list.add(new Point(i.end,0));
    	}
    	Collections.sort(list);
    	int max=0,tmp=0;
    	for(Point p:list){
    		if(p.flag==1){
    			tmp++;
    		}else{
    			tmp--;
    		}
    		max = Math.max(max, tmp);
    	}
    	return max;
    }
    
    public static void main(String[] args) {
		List list = new ArrayList<Interval>();
		Interval in1 = new Interval(1, 10);
		Interval in2 = new Interval(2, 3);
		Interval in3 = new Interval(5, 8);
		Interval in4 = new Interval(4, 7);
		list.add(in1);
		list.add(in2);
		list.add(in3);
		list.add(in4);
		Solution solution = new Solution();
		int num = solution.countOfAirplanes(list);
		System.out.println(num);
	}
}