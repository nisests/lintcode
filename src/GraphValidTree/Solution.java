package GraphValidTree;

import java.util.ArrayList;

/* ���� n ���ڵ㣬��ŷֱ�� 0 �� n - 1 ���Ҹ���һ�� ���� �ߵ��б� (����ÿ���ߵ���������),
 * дһ������ȥ�ж����ţ������ͼ�Ƿ���һ���� 
 * 
 * ע��
 * ����Լ������ǲ�������ظ��ı��ڱߵ��б���. 
 * ����ߡ�[0, 1] �� [1, 0]����ͬһ���ߣ� ������ǲ���ͬʱ���������Ǹ���ıߵ��б��С�*/

public class Solution {
    /**
     * @param n an integer
     * @param edges a list of undirected edges
     * @return true if it's a valid tree, or false
     */
    int[] id;
    public boolean validTree(int n, int[][] edges) {
        // Write your code here
        if(edges.length != n-1){
            return false;
        }
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i] = i;
        }
        for(int i=0;i<n-1;i++){
            if(find(edges[i][0])==find(edges[i][1])){
                return false;
            }
            union(edges[i][0],edges[i][1]);
        }
        return true;
    }
    public int find(int p){
        return id[p];
    }
    public void union(int p,int q){
        if(id[p]==id[q]){
            return;
        }
        for(int i=0;i<id.length;i++){
            if(id[i]==id[p]){
                id[i]=id[q];
            }
        }
    }
}